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

    public User(Date created, Date lastModified, String name, String surname, String phone, String email, Role role, List<Address> addresses, List<Reservation> reservations, List<Service> ownService, List<Business> business) {
        this.created = created;
        this.lastModified = lastModified;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.role = role;
        this.addresses = addresses;
        this.reservations = reservations;
        this.ownService = ownService;
        this.business = business;
    }

    public User() {
    }

    public User(Date created, Date lastModified, String name, String surname, String phone, String email, Role role) {
        this.created = created;
        this.lastModified = lastModified;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.role = role;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Service> getOwnService() {
        return ownService;
    }

    public void setOwnService(List<Service> ownService) {
        this.ownService = ownService;
    }

    public List<Business> getBusiness() {
        return business;
    }

    public void setBusiness(List<Business> business) {
        this.business = business;
    }
}
