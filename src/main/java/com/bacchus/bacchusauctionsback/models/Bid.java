package com.bacchus.bacchusauctionsback.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Bid implements Comparable<Bid>{

    @Id
    @GeneratedValue
    private Long id;
    private String productId;
    private String bidderFullName;
    private Timestamp bidTime;
    private Double offer;

    public Bid() {
    }

    public Bid(Double offer) {
        this.offer = offer;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getBidTime() {
        return bidTime;
    }

    public void setBidTime(Timestamp bidTime) {
        this.bidTime = bidTime;
    }

    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getBidderFullName() {
        return bidderFullName;
    }

    public void setBidderFullName(String bidderFullName) {
        this.bidderFullName = bidderFullName;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "id=" + id +
                ", productId='" + productId + '\'' +
                ", bidTime='" + bidTime + '\'' +
                ", offer=" + offer +
                '}';
    }

    @Override
    public int compareTo(Bid o) {
        return this.offer.compareTo(o.getOffer());
    }
}
