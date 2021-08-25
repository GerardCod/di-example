package app.controllers;

import app.entities.Pokemon;
import app.services.Service;
import app.utils.ResponseCodes;
import app.utils.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Implements the actions to manage the user requests.
 */
public class PokemonController implements Controller {
    private Service service;

    public PokemonController(Service service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<List<Pokemon>> findAll() {
        Optional<List<Pokemon>> result = this.service.findAll();

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), ResponseCodes.OK);
        }

        return new ResponseEntity<>(new ArrayList<>(), ResponseCodes.NOT_FOUND);
    }

    @Override
    public ResponseEntity<Pokemon> findById(Long id) {
        Optional<Pokemon> result = this.service.findById(id);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), ResponseCodes.OK);
        }
        return new ResponseEntity<>(new Pokemon(), ResponseCodes.NOT_FOUND);
    }

    @Override
    public ResponseEntity<Pokemon> create(Pokemon pokemon) {
        Optional<Pokemon> result = this.service.create(pokemon);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), ResponseCodes.CREATED);
        }

        return new ResponseEntity<>(new Pokemon(), ResponseCodes.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<Pokemon> update(Pokemon pokemon, Long id) {
        Optional<Pokemon> result = this.service.update(pokemon, id);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), ResponseCodes.OK);
        }

        return new ResponseEntity<>(new Pokemon(), ResponseCodes.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<Boolean> deleteById(Long id) {
        Optional<Boolean> result = this.service.deleteById(id);

        if (result.isPresent()) {
            return new ResponseEntity<>(result.get(), ResponseCodes.OK);
        }

        return new ResponseEntity<>(false, ResponseCodes.INTERNAL_SERVER_ERROR);
    }
}
