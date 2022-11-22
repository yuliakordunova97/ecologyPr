package com.example.demo.model;
import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@Table(name = "region_inf")
public class RegionInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String regionName;

    @Column()
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @Column()
    private int temperature;

    @Column()
    private int airPollution;

    @Column()
    private int waterPollution;

    @Column()
    private int earthPollution;

    @OneToOne(mappedBy = "regionInformation", orphanRemoval = true)
    private Result resultInfo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public Result getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(Result resultInfo) {
        this.resultInfo = resultInfo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getEarthPollution() {
        return earthPollution;
    }

    public void setEarthPollution(int earthPollution) {
        this.earthPollution = earthPollution;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getAirPollution() {
        return airPollution;
    }

    public void setAirPollution(int airPollution) {
        this.airPollution = airPollution;
    }

    public int getWaterPollution() {
        return waterPollution;
    }

    public void setWaterPollution(int waterPollution) {
        this.waterPollution = waterPollution;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}