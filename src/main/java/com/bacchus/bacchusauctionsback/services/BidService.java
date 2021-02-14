package com.bacchus.bacchusauctionsback.services;

import com.bacchus.bacchusauctionsback.models.Bid;
import com.bacchus.bacchusauctionsback.repositories.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BidService {

    @Autowired
    private BidRepository bidRepository;

    public Bid saveBid(Bid bid){
        return bidRepository.save(bid);
    }

    public List<Bid> getBids() {
        List<Bid> bids = new ArrayList<>();
        bidRepository.findAll().forEach(bids::add);
        return bids;
    }
}
