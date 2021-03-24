package io.resman.resman.dbseeder;

import io.resman.resman.models.*;
import io.resman.resman.repositories.RestaurantRepository;
import org.bson.types.ObjectId;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class DbSeeder implements CommandLineRunner {
    private RestaurantRepository restaurantRepository;

    public DbSeeder(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Restaurant napoliPizza = new Restaurant(
                ObjectId.get(),
                "Napoli Pizza & Kebab",
                new Address(12, "Turnpike Lane", "London", "N8 0PT"),
                "contact@napolipizza.com",
                "0123456789",
                Arrays.asList(
                        new Menu(
                                ObjectId.get(),
                                Arrays.asList(
                                        new Category(
                                                ObjectId.get(),
                                                "Drinks",
                                                Arrays.asList(
                                                        new Product(ObjectId.get(),"Fanta", "330ml", 1.99),
                                                        new Product(ObjectId.get(),"Coka Cola", "330ml", 1.99)
                                                )
                                        ),
                                        new Category(
                                                ObjectId.get(),
                                                "Doners",
                                                Arrays.asList(
                                                        new Product(ObjectId.get(),"Chicken Doned", "Small", 4.99),
                                                        new Product(ObjectId.get(),"Chicken Doner", "Large", 6.99),
                                                        new Product(ObjectId.get(),"Lamb Doner", "Small", 6.99),
                                                        new Product(ObjectId.get(),"Lamb Doner", "Large", 8.99)
                                                )
                                        ),
                                        new Category(
                                                ObjectId.get(),
                                                "Wraps",
                                                Arrays.asList(
                                                        new Product(ObjectId.get(),"Chicken Wrap", "Small", 3.99),
                                                        new Product(ObjectId.get(),"Chick Wrap", "Large", 5.99),
                                                        new Product(ObjectId.get(),"Lamb Wrap", "Small", 5.99),
                                                        new Product(ObjectId.get(),"Lamb Wrap", "Large", 6.99)
                                                )
                                        )
                                )
                        )
                ),
                Arrays.asList(
                        new Review(ObjectId.get(),"John Smith", "Amazing food as always", 5, false),
                        new Review(ObjectId.get(),"Bob Man", "Love the kebab in this shop", 5, false)
                )
        );

        Restaurant uludagGrill = new Restaurant(
                ObjectId.get(),
                "Uludag Charcoal Kebab",
                new Address(5, "Vicarage Parade,", "London", "N15 3BL"),
                "contact@uludagcharcoalkebab.com",
                "0123456789",
                Arrays.asList(
                        new Menu(
                                ObjectId.get(),
                                Arrays.asList(
                                        new Category(
                                                ObjectId.get(),
                                                "Drinks",
                                                Arrays.asList(
                                                        new Product(ObjectId.get(),"Sarikiz", "250ml", 2.99),
                                                        new Product(ObjectId.get(),"Ayran", "330ml", 2.99)
                                                )
                                        ),
                                        new Category(
                                                ObjectId.get(),
                                                "Burgers",
                                                Arrays.asList(
                                                        new Product(ObjectId.get(),"Quarter Pounder", "Small", 5.99),
                                                        new Product(ObjectId.get(),"Half Pounder ", "Large", 8.99)
                                                )
                                        ),
                                        new Category(
                                                ObjectId.get(),
                                                "Wraps",
                                                Arrays.asList(
                                                        new Product(ObjectId.get(),"Chicken Wrap", "Small", 3.99),
                                                        new Product(ObjectId.get(),"Chick Wrap", "Large", 5.99),
                                                        new Product(ObjectId.get(),"Lamb Wrap", "Small", 5.99),
                                                        new Product(ObjectId.get(),"Lamb Wrap", "Large", 6.99)
                                                )
                                        )
                                )
                        )
                ),
                Arrays.asList(
                        new Review(ObjectId.get(),"John Smith", "Good food, nice staff", 5, false),
                        new Review(ObjectId.get(),"Bob Man", "Best grill in town!", 5, false)
                )
        );

        // drop all restaurants
        this.restaurantRepository.deleteAll();

        // add our restaurants to the database
        List<Restaurant> restaurants = Arrays.asList(napoliPizza, uludagGrill);
        this.restaurantRepository.saveAll(restaurants);
    }
}
