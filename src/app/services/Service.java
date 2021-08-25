package app.services;

import app.entities.Pokemon;

import java.util.List;
import java.util.Optional;

/**
 * Abstracts the features to consume a database.
 */
public interface Service {
    Optional<List<Pokemon>> findAll();
    Optional<Pokemon> findById(Long id);
    Optional<Pokemon> create(Pokemon pokemon);
    Optional<Pokemon> update(Pokemon pokemon, Long id);
    Optional<Boolean> deleteById(Long id);
}
