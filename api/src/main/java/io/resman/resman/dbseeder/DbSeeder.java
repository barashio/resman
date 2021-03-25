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
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://images.squarespace-cdn.com/content/v1/5ca3b2217980b3338106d9bf/1586875728811-MMCQS9KHUQ4OVWV9D4LE/ke17ZwdGBToddI8pDm48kJUlZr2Ql5GtSKWrQpjur5t7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1UYapt4KGntwbjD1IFBRUBU6SRwXJogFYPCjZ6mtBiWtU3WUfc_ZsVm9Mi1E6FasEnQ/11.png?format=2500w",
                                                                "Fanta",
                                                                "330ml",
                                                                1.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://cdn11.bigcommerce.com/s-2fq65jrvsu/images/stencil/1280x1280/products/772/1895/d-coke-can_4__88515.1592026059.jpg?c=1",
                                                                "Coka Cola",
                                                                "330ml",
                                                                1.99)
                                                )
                                        ),
                                        new Category(
                                                ObjectId.get(),
                                                "Doners",
                                                Arrays.asList(
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://live.staticflickr.com/4163/34554742702_b54131e9f3_b.jpg",
                                                                "Chicken Doned",
                                                                "Small",
                                                                4.99
                                                        ),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Chicken Doner",
                                                                "Large",
                                                                6.99
                                                        ),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Lamb Doner",
                                                                "Small",
                                                                6.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Lamb Doner",
                                                                "Large",
                                                                8.99
                                                        )
                                                )
                                        ),
                                        new Category(
                                                ObjectId.get(),
                                                "Wraps",
                                                Arrays.asList(
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Chicken Wrap",
                                                                "Small",
                                                                3.99
                                                        ),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Chick Wrap",
                                                                "Large",
                                                                5.99
                                                        ),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Lamb Wrap",
                                                                "Small",
                                                                5.99
                                                        ),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Lamb Wrap",
                                                                "Large",
                                                                6.99
                                                        )
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
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Sarikiz",
                                                                "250ml",
                                                                2.99
                                                        ),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Ayran",
                                                                "330ml",
                                                                2.99
                                                        )
                                                )
                                        ),
                                        new Category(
                                                ObjectId.get(),
                                                "Burgers",
                                                Arrays.asList(
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Quarter Pounder",
                                                                "Small",
                                                                5.99
                                                        ),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Half Pounder ",
                                                                "Large",
                                                                8.99
                                                        )
                                                )
                                        ),
                                        new Category(
                                                ObjectId.get(),
                                                "Wraps",
                                                Arrays.asList(
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Chicken Wrap",
                                                                "Small",
                                                                3.99),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Chick Wrap",
                                                                "Large",
                                                                5.99
                                                        ),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Lamb Wrap",
                                                                "Small",
                                                                5.99
                                                        ),
                                                        new Product(
                                                                ObjectId.get(),
                                                                "https://i.redd.it/hta7nztex5511.jpg",
                                                                "Lamb Wrap",
                                                                "Large",
                                                                6.99
                                                        )
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
