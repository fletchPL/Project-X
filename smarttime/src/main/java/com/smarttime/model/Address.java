package com.smarttime.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by michal.berentowicz on 13.05.2017.
 */
@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private Date created;
    private Date lastModified;

    private boolean main;
    private String city;
    private String postCode;
    private String street;
    private String homeNumber;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "business_id")
    @JsonBackReference
    private Business business;
}
