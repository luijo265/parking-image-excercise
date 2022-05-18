package com.parking.images.web.rest;

import com.parking.images.domain.ImageVehicule;
import com.parking.images.domain.service.ImageVehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/images")
public class ImageRestController {

    @Autowired
    private ImageVehiculeService imageVehiculeService;

    @GetMapping
    public List<ImageVehicule> getImageVehicules(){
        return imageVehiculeService.getImageVehicules();
    }

}
