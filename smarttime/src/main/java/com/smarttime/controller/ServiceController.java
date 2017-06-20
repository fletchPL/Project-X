package com.smarttime.controller;

import com.google.gson.Gson;
import com.smarttime.model.Foo;
import com.smarttime.model.Response;
import com.smarttime.model.Service;
import com.smarttime.model.Status;
import com.smarttime.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by michal.berentowicz on 20.06.2017.
 */
@RestController
public class ServiceController {

    @Autowired
    private ServiceRepository serviceRepository;

    private Gson gson = new Gson();

    @RequestMapping(value = "/service/update", method = RequestMethod.POST)
    public Status update(@RequestBody String json) {
        try{
            Service service = gson.fromJson(json,Service.class);
            serviceRepository.save(service);
            return Status.success;
        }catch (Exception e){
            return Status.error;
        }
    }

    @RequestMapping(value = "/service/remove", method = RequestMethod.POST)
    public @ResponseBody Status remove(@RequestBody String json) {
        try{
            Service service = gson.fromJson(json,Service.class);
            serviceRepository.delete(service.getId());
            return Status.success;
        }catch (Exception e){
            return Status.error;
        }
    }

    @RequestMapping(value = "/service/get/{id}", method = RequestMethod.GET)
    public Service get(@PathVariable(value="id") int id) {
        return serviceRepository.findOne(id);
    }

    @RequestMapping(value = "/service/get/all", method = RequestMethod.GET)
    public List<Service> getAll() {
        return serviceRepository.findAll();
    }
}
