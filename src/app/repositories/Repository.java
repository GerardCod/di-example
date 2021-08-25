package app.repositories;

import app.entities.Pokemon;

import java.util.List;

/**
 * Set the set of methods of a given repository
 * @author Gerardo Aguilar
 * @version 1.0.0 24/08/2021
 */
public interface Repository<E, T> {
    List<E> findAll();
    E findById(T id);
    E create(E entity);
    E update(E entity, T id);
    Boolean deleteById(T id);
}
