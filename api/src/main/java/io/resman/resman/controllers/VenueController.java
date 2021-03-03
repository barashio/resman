package io.resman.resman.controllers;

import io.resman.resman.models.Venue;
import io.resman.resman.repositories.VenueRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/venue")
public class VenueController {
    @Autowired
    public VenueRepository venueRepository;

    @GetMapping(value = "/all")
    public List<Venue> getAllVenues() {
        return venueRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Venue getVenueById(ObjectId id) {
        return venueRepository.findBy_id(id);
    }

    @PutMapping(value = "/{id}")
    public void modifyVenueById(ObjectId id, @Valid @RequestBody Venue venue) {
        venue.set_id(id);
        venueRepository.save(venue);
    }

    @PostMapping(value = "/create")
    public Venue createVenue(@Valid @RequestBody Venue venue) {
        venue.set_id(ObjectId.get());
        venueRepository.save(venue);
        return venue;
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteVenueById(@PathVariable ObjectId id) {
        venueRepository.delete(venueRepository.findBy_id(id));
    }

    @DeleteMapping(value = "delete/all")
    public void deleteAllVenues() {
        venueRepository.deleteAll();
    }
}
