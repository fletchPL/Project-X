package com.smarttime.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by michal.berentowicz on 14.05.2017.
 */
@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private int id;
    private Date created;
    private Date lastModified;

    private Date startDate;
    private Date endData;
    private String cost;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "service_id")
    @JsonBackReference
    private Service service;

    public Reservation(Date created, Date lastModified, Date startDate, Date endData, String cost, User user, Service service) {
        this.created = created;
        this.lastModified = lastModified;
        this.startDate = startDate;
        this.endData = endData;
        this.cost = cost;
        this.user = user;
        this.service = service;
    }

    public Reservation() {
    }

    public Reservation(Date created, Date lastModified, Date startDate, Date endData, String cost) {
        this.created = created;
        this.lastModified = lastModified;
        this.startDate = startDate;
        this.endData = endData;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndData() {
        return endData;
    }

    public void setEndData(Date endData) {
        this.endData = endData;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
