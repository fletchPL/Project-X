package com.smarttime.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by michal.berentowicz on 13.05.2017.
 */
@Entity
public class Business {
    @Id
    @GeneratedValue
    private Long id;
    private Date created;
    private Date lastModified;

    private String name;

    @OneToMany(mappedBy = "business", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Address> address;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "businessOwner_id")
    @JsonBackReference
    private User businessOwner;

    @OneToMany(mappedBy = "business", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Service> services;


    public Business(Date created, Date lastModified, String name, List<Address> address, User businessOwner, List<Service> services) {
        this.created = created;
        this.lastModified = lastModified;
        this.name = name;
        this.address = address;
        this.businessOwner = businessOwner;
        this.services = services;
    }

    public Business() {
    }

    public Business(Date created, Date lastModified, String name) {
        this.created = created;
        this.lastModified = lastModified;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public User getBusinessOwner() {
        return businessOwner;
    }

    public void setBusinessOwner(User businessOwner) {
        this.businessOwner = businessOwner;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}

