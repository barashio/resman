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
                                                "Meat",
                                                Arrays.asList(
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Chicken Doner Large",
                                                                "Served with salad, pita bread and sauce.",
                                                                8.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Lamb Doner Large",
                                                                "Served with salad, pita bread and sauce.",
                                                                8.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Chicken Meat and Chips",
                                                                "Served with salad, pita bread and sauce.",
                                                                10.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Lamb Meat and Chips",
                                                                "Served with salad, pita bread and sauce.",
                                                                10.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Chicken Wrap",
                                                                "Served with salad or chips (inside)",
                                                                6.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Lamb Wrap",
                                                                "Served with salad or chips (inside)",
                                                                6.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Mix Meat Wrap",
                                                                "Served with salad or chips (inside)",
                                                                8.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Lamb Shish",
                                                                "Served with salad, pita bread and sauce.",
                                                                12.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Chicken Shish",
                                                                "Served with salad, pita bread and sauce.",
                                                                11.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Mix Lamb & Chicken Shish",
                                                                "Served with salad, pita bread and sauce.",
                                                                14.99)
                                                )
                                        ),
                                        new Category(
                                                ObjectId.get(),
                                                "Pizza",
                                                Arrays.asList(
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "10 Inch Any 3 Toppings",
                                                                "Choose from salami, beef, chicken, sausage, haloumi, olives, peppers, mushrooms, sweetcorn, onions, fresh tomatoes, chillies .",
                                                                8.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "12 Inch Any 3 Toppings",
                                                                "Choose from salami, beef, chicken, sausage, haloumi, olives, peppers, mushrooms, sweetcorn, onions, fresh tomatoes, chillies .",
                                                                10.99)
                                                )
                                        ),
                                        new Category(
                                                ObjectId.get(),
                                                "Other",
                                                Arrays.asList(
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Falafel Wrap",
                                                                "Choose with salad or chips.",
                                                                7.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Salad Only",
                                                                "",
                                                                3.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://upload.wikimedia.org/wikipedia/commons/a/ac/No_image_available.svg",
                                                                "Chips Only",
                                                                "",
                                                                3.99)
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


        // drop all restaurants
        this.restaurantRepository.deleteAll();

        // add our restaurants to the database
        List<Restaurant> restaurants = Arrays.asList(napoliPizza);
        this.restaurantRepository.saveAll(restaurants);
    }
}
