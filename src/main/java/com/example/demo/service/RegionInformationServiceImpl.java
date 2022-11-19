package com.example.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.RegionInformation;
import com.example.demo.repository.RegionInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class RegionInformationServiceImpl implements RegionInformationService {

    @Autowired
    private RegionInformationRepository regionInformationRepository;

    @Override
    public List <RegionInformation> getAllInformation() {
        return regionInformationRepository.findAll();
    }

    @Override
    public void saveRegionInformation(RegionInformation information) {
        this.regionInformationRepository.save(information);
    }

    @Override
    public RegionInformation getRegionInformationById(long id) {
        Optional <RegionInformation> optional = regionInformationRepository.findById(id);
        RegionInformation information = null;
        if (optional.isPresent()) {
            information = optional.get();
        } else {
            throw new RuntimeException(" Information not found for id :: " + id);
        }
        return information;
    }

    @Override
    public void deleteRegionInformationById(long id) {
        this.regionInformationRepository.deleteById(id);
    }





    @Override
    public RegionInformation getRegionInformationByRegionName(String regionName) {

        return regionInformationRepository.findByRegionName(regionName);
    }

    @Override
    public List<RegionInformation> getAllRegionInformationByRegionName(String regionName) {
        return regionInformationRepository.findAllByRegionName(regionName);
    }

    @Override
    public List<RegionInformation> getAllRegionInformationByDate(LocalDate localDate) {
        return regionInformationRepository.findAllByDate(localDate);
    }


}