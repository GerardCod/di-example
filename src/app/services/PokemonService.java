package app.services;

import app.entities.Pokemon;
import app.repositories.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Implements the functions to consume a database with a pokemon table.
 */
public class PokemonService implements Service {
    private Repository<Pokemon, Long> repository;

    public PokemonService(Repository<Pokemon, Long> repository) {
        this.repository = repository;
    }

    @Override
    public Optional<List<Pokemon>> findAll() {
        return Optional.of(this.repository.findAll());
    }

    @Override
    public Optional<Pokemon> findById(Long id) {
        return Optional.of(this.repository.findById(id));
    }

    @Override
    public Optional<Pokemon> create(Pokemon pokemon) {
        return Optional.of(this.repository.create(pokemon));
    }

    @Override
    public Optional<Pokemon> update(Pokemon pokemon, Long id) {
        return Optional.of(this.repository.update(pokemon, id));
    }

    @Override
    public Optional<Boolean> deleteById(Long id) {
        return Optional.of(this.repository.deleteById(id));
    }
}
