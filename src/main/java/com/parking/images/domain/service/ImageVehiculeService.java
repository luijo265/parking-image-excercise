package com.parking.images.domain.service;

import com.parking.images.domain.ImageVehicule;
import com.parking.images.domain.repository.ImageVehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageVehiculeService {
    @Autowired
    private ImageVehiculeRepository imageVehiculeRepository;

    public List<ImageVehicule> getImageVehicules(){
        return imageVehiculeRepository.getImageVehicules();
    }
}
