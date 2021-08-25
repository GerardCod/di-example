package app;

import app.controllers.Controller;
import app.controllers.PokemonController;
import app.entities.Pokemon;
import app.repositories.PokemonRepository;
import app.repositories.Repository;
import app.services.PokemonService;
import app.services.Service;

public class App {
    public static void main(String[] args) {
        Repository<Pokemon, Long> repository = new PokemonRepository();
        Service service = new PokemonService(repository);
        Controller controller = new PokemonController(service);

        Pokemon test1 = new Pokemon();
        test1.setName("milaneso");
        test1.setSpecie("charizard");

        Pokemon test2 = new Pokemon();
        test2.setName("krory");
        test2.setSpecie("zubat");

        System.out.println(controller.create(test1));
        System.out.println(controller.findAll());
        System.out.println(controller.findById(1L));

        controller.create(test2);
        System.out.println(controller.findAll());

        test2.setName("batman");
        System.out.println(controller.update(test2, 2L));
        System.out.println(controller.findAll());

        System.out.println(controller.deleteById(2L));
        System.out.println(controller.findAll());
    }
}
