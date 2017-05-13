package com.smarttime.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by michal.berentowicz on 13.05.2017.
 */
@Entity
public class Service {
    @Id
    @GeneratedValue
    private Long id;
    private Date created;
    private Date lastModified;

    private String name;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id")
    @JsonBackReference
    private User owner;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "business_id")
    @JsonBackReference
    private Business business;
    private String description;
    private String time;
    private String price;
    @ManyToMany(mappedBy = "services", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference
    private List<User> users;

}
