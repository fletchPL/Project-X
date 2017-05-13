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
}
