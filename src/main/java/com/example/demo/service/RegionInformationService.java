package com.example.demo.service;
import com.example.demo.model.RegionInformation;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.util.List;


public interface RegionInformationService {
    List <RegionInformation> getAllInformation();
    void saveRegionInformation(RegionInformation information);
    RegionInformation getRegionInformationById(long id);
    void deleteRegionInformationById(long id);
    RegionInformation getRegionInformationByRegionName(String regionName);
    List<RegionInformation> getAllRegionInformationByRegionName(String regionName);
    List<RegionInformation> getAllRegionInformationByDate(LocalDate localDate);

}