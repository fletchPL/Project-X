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
    private Long id;
    private Date created;
    private Date lastModified;

    private Date startDate;
    private Date endData;
    private Float cost;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "service_id")
    @JsonBackReference
    private Service service;
}
