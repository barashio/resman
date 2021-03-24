package io.resman.resman.controllers;


import io.resman.resman.models.Restaurant;
import io.resman.resman.repositories.RestaurantRepository;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {
    private RestaurantRepository restaurantRepository;

    public RestaurantController(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @GetMapping("/all")
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }


    @PutMapping("/new")
    public void insert(@RequestBody Restaurant restaurant) {
        this.restaurantRepository.insert(restaurant);
    }

    @PostMapping("/update")
    public void update(@RequestBody Restaurant restaurant) {
        this.restaurantRepository.save(restaurant);
    }

    @GetMapping("/{id}")
    public Restaurant getById(@PathVariable("id") ObjectId _id) {
        Restaurant restaurant = this.restaurantRepository.findBy_id(_id);
        return restaurant;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") String _id) {
        this.restaurantRepository.deleteById(_id);
    }

}
