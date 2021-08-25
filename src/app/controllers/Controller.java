package app.controllers;

import app.entities.Pokemon;
import app.utils.ResponseEntity;

import java.util.List;

/**
 * Sets the actions that a controller can perform.
 */
public interface Controller {
    ResponseEntity<List<Pokemon>> findAll();
    ResponseEntity<Pokemon> findById(Long id);
    ResponseEntity<Pokemon> create(Pokemon pokemon);
    ResponseEntity<Pokemon> update(Pokemon pokemon, Long id);
    ResponseEntity<Boolean> deleteById(Long id);
}
