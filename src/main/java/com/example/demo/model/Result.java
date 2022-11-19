package com.example.demo.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String airPollutionResult;

    private String waterPollutionResult;

    private String earthPollutionResult;

    @OneToOne
    private RegionInformation regionInformation;


    public Result() {
    }

    public Result(String airPollutionResult, String waterPollutionResult, String earthPollutionResult, RegionInformation regionInformation) {
        this.airPollutionResult = airPollutionResult;
        this.waterPollutionResult = waterPollutionResult;
        this.earthPollutionResult = earthPollutionResult;
        this.regionInformation = regionInformation;
    }

    public RegionInformation getRegionInformation() {
        return regionInformation;
    }

    public void setRegionInformation(RegionInformation regionInformation) {
        this.regionInformation = regionInformation;
    }

    public String getAirPollutionResult() {
        return airPollutionResult;
    }

    public void setAirPollutionResult(String airPollutionResult) {
        this.airPollutionResult = airPollutionResult;
    }

    public String getWaterPollutionResult() {
        return waterPollutionResult;
    }

    public void setWaterPollutionResult(String waterPollutionResult) {
        this.waterPollutionResult = waterPollutionResult;
    }

    public String getEarthPollutionResult() {
        return earthPollutionResult;
    }

    public void setEarthPollutionResult(String earthPollutionResult) {
        this.earthPollutionResult = earthPollutionResult;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
