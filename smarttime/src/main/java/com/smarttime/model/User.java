package com.smarttime.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by michal.berentowicz on 04.05.2017.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private Date created;
    private Date lastModified;

    private String name;
    private String surname;
    private String phone;
    private String email;
    private Role role;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Address> addresses;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Service> ownService;

    @OneToMany(mappedBy = "businessOwner", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Business> business;


}
