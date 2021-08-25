package app.repositories;

import app.entities.Pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements all the features to simulate an interaction with a database.
 * @author Gerardo Aguilar
 * @version 1.0.0 24/08/2021
 */
public class PokemonRepository implements Repository<Pokemon, Long>{
    private final List<Pokemon> mockDatabase;

    public PokemonRepository() {
        this.mockDatabase = new ArrayList<>();
    }

    @Override
    public List<Pokemon> findAll() {
        return mockDatabase;
    }

    @Override
    public Pokemon findById(Long id) {
        for (Pokemon p: mockDatabase) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Pokemon create(Pokemon entity) {
        entity.setId(mockDatabase.size() + 1L);
        mockDatabase.add(entity);
        return entity;
    }

    @Override
    public Pokemon update(Pokemon entity, Long id) {
        for (Pokemon p: mockDatabase) {
            if (p.getId().equals(id)) {
                p.setName(entity.getName());
                p.setSpecie(entity.getSpecie());
                return p;
            }
        }
        return null;
    }

    @Override
    public Boolean deleteById(Long id) {
        return mockDatabase.removeIf(p -> p.getId().equals(id));
    }
}
