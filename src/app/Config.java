package app;

import app.controllers.Controller;
import app.controllers.PokemonController;
import app.entities.Pokemon;
import app.repositories.PokemonRepository;
import app.repositories.Repository;
import app.services.PokemonService;
import app.services.Service;

/**
 * Creates the instances for the dependencies in every component of code
 * @author  Gerardo Aguilar
 * @version 1.0.0 25/08/2021.
 */
public class Config {
    public static Repository<Pokemon, Long> repository() {
        return new PokemonRepository();
    }

    public static Service service () {
        return new PokemonService(Config.repository());
    }

    public static Controller controller () {
        return new PokemonController(Config.service());
    }
}
