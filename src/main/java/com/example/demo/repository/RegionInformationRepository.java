package com.example.demo.repository;

import com.example.demo.model.RegionInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface RegionInformationRepository extends JpaRepository<RegionInformation, Long>{

    RegionInformation findByRegionName(String regionName);

    List<RegionInformation> findAllByRegionName(String name);

    List<RegionInformation> findAllByDate (LocalDate localDate);

}