package com.bacchus.bacchusauctionsback.controllers;

import com.bacchus.bacchusauctionsback.models.Bid;
import com.bacchus.bacchusauctionsback.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class BidController {

    @Autowired
    private BidService bidService;


    @PostMapping("/bids")
    public Bid makeAnOffer(@RequestBody Bid bid) {
        return bidService.saveBid(bid);
    }

    @GetMapping("/bids")
    public List<Bid> getAllBids() {
        return bidService.getBids();
    }
}
