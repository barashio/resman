package io.resman.resman.controllers;

import io.resman.resman.models.CustomerOrder;
import io.resman.resman.repositories.CustomerOrderRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/restaurant/orders")
public class OrderController {
    private CustomerOrderRepository CustomerOrderRepository;

    public OrderController(CustomerOrderRepository CustomerOrderRepository) {
        this.CustomerOrderRepository = CustomerOrderRepository;
    }

    @GetMapping("/all")
    public List<CustomerOrder> getAllOrders() { return CustomerOrderRepository.findAll(); }
}
