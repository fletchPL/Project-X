package com.smarttime.controller;

import com.smarttime.model.*;
import com.smarttime.repository.BusinessRepository;
import com.smarttime.repository.ReservationRepository;
import com.smarttime.repository.ServiceRepository;
import com.smarttime.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by michal.berentowicz on 14.05.2017.
 */
@RestController
public class ControllerRest {

    @Autowired
    private BusinessRepository businessRepository;

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @RequestMapping("/dummyData")
    private String prepareData() {
        try {
            Business business = new Business(new Date(), new Date(), "Wulkanizajca");
            Service service = new Service(new Date(), new Date(), "Wymiana opon", "Najtańsza w mieście wymiana opon!", "30min", "50zl");
            Reservation reservation = new Reservation(new Date(), new Date(), new Date(), new Date(), "10zl");
            User user = new User(new Date(), new Date(), "Jan", "Kowalski", "123-123-123", "jan@kowalski.pl", Role.User);

            List<Business> businesses = new ArrayList<>();
            businesses.add(business);

            List<Service> services = new ArrayList<>();
            services.add(service);
            services.add(service);
            business.setServices(services);

            List<Reservation> reservations = new ArrayList<>();
            reservations.add(reservation);
            reservations.add(reservation);
            service.setReservations(reservations);

            business.setAddress(getAddresses(user, business));
            business.setServices(services);
            business.setBusinessOwner(user);

            service.setOwner(user);
            service.setBusiness(business);
            service.setReservations(reservations);

            reservation.setUser(user);
            reservation.setService(service);

            user.setAddresses(getAddresses(user, business));
            user.setReservations(reservations);
            user.setOwnService(services);
            user.setBusiness(businesses);

            businessRepository.save(business);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "\"success\":\"success\"";
    }

    @RequestMapping("/dummyData/business")
    private List<Business> getBusiness() {
        return businessRepository.findAll();
    }

    @RequestMapping("/dummyData/services")
    private List<Service> getService() {
        return serviceRepository.findAll();
    }


    @RequestMapping("/dummyData/users")
    private List<User> getUser() {
        return userRepository.findAll();
    }

    @RequestMapping("/dummyData/reservation")
    private List<Reservation> getReservation() {
        return reservationRepository.findAll();
    }

    public List<Address> getAddresses(User user, Business business) {
        Address address1 = new Address(new Date(), new Date(), true, "Lódź", "93-574", "Politechiniki", "20/1", user, business);
        Address address2 = new Address(new Date(), new Date(), false, "Zgierz", "93-574", "Lódzka", "1", user, business);
        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);
        return addresses;
    }
}
