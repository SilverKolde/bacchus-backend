package com.bacchus.bacchusauctionsback.repositories;

import com.bacchus.bacchusauctionsback.models.Bid;
import org.springframework.data.repository.CrudRepository;

public interface BidRepository extends CrudRepository<Bid, Long> {
}
