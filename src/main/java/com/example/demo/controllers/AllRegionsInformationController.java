package com.example.demo.controllers;

import com.example.demo.model.RegionInformation;
import com.example.demo.service.RegionInformationService;
import com.example.demo.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class AllRegionsInformationController {

    @Autowired
    private RegionInformationService regionInformationService;

    @Autowired
    private ResultService resultService;

    @GetMapping("/allRegions/lviv_region")
    public String viewRegionPage(@ModelAttribute("regionInformation") RegionInformation regionInformation, Model model) {
        Map<LocalDate, Integer> surveyMapTemp = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAir = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWater = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarth = new LinkedHashMap<>();
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Львівський")) {
            surveyMapTemp.put(r.getDate(), r.getTemperature());
            surveyMapAir.put(r.getDate(), r.getAirPollution());
            surveyMapWater.put(r.getDate(), r.getWaterPollution());
            surveyMapEarth.put(r.getDate(), r.getEarthPollution());
        }

        model.addAttribute("listRegionInformation", regionInformationService.getAllRegionInformationByRegionName("Львівський"));
        model.addAttribute("surveyMapTemp", surveyMapTemp);
        model.addAttribute("surveyMapAir", surveyMapAir);
        model.addAttribute("surveyMapWater", surveyMapWater);
        model.addAttribute("surveyMapEarth", surveyMapEarth);
        return "/allRegions/lviv_region";
    }

    @GetMapping("/allRegions/chervonograd_region")
    public String viewChrervonogradRegionPage(@ModelAttribute("regionInformation") RegionInformation regionInformation, Model model) {
        Map<LocalDate, Integer> surveyMapTemp = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAir = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWater = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarth = new LinkedHashMap<>();

        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Червоноградський")) {
            surveyMapTemp.put(r.getDate(), r.getTemperature());
            surveyMapAir.put(r.getDate(), r.getAirPollution());
            surveyMapWater.put(r.getDate(), r.getWaterPollution());
            surveyMapEarth.put(r.getDate(), r.getEarthPollution());
        }

        model.addAttribute("listRegionInformation", regionInformationService.getAllRegionInformationByRegionName("Червоноградський"));
        model.addAttribute("surveyMapTemp", surveyMapTemp);
        model.addAttribute("surveyMapAir", surveyMapAir);
        model.addAttribute("surveyMapWater", surveyMapWater);
        model.addAttribute("surveyMapEarth", surveyMapEarth);
        return "/allRegions/chervonograd_region";
    }

    @GetMapping("/allRegions/drogobych_region")
    public String viewDrogobychRegionPage(@ModelAttribute("regionInformation") RegionInformation regionInformation, Model model) {
        Map<LocalDate, Integer> surveyMapTemp = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAir = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWater = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarth = new LinkedHashMap<>();

        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Дрогобицький")) {
            surveyMapTemp.put(r.getDate(), r.getTemperature());
            surveyMapAir.put(r.getDate(), r.getAirPollution());
            surveyMapWater.put(r.getDate(), r.getWaterPollution());
            surveyMapEarth.put(r.getDate(), r.getEarthPollution());
        }

        model.addAttribute("listRegionInformation", regionInformationService.getAllRegionInformationByRegionName("Червоноградський"));
        model.addAttribute("surveyMapTemp", surveyMapTemp);
        model.addAttribute("surveyMapAir", surveyMapAir);
        model.addAttribute("surveyMapWater", surveyMapWater);
        model.addAttribute("surveyMapEarth", surveyMapEarth);
        return "/allRegions/drogobych_region";
    }

    @GetMapping("/allRegions/sambir_region")
    public String viewSambiirRegionPage(@ModelAttribute("regionInformation") RegionInformation regionInformation, Model model) {
        Map<LocalDate, Integer> surveyMapTemp = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAir = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWater = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarth = new LinkedHashMap<>();

        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Самбірський")) {
            surveyMapTemp.put(r.getDate(), r.getTemperature());
            surveyMapAir.put(r.getDate(), r.getAirPollution());
            surveyMapWater.put(r.getDate(), r.getWaterPollution());
            surveyMapEarth.put(r.getDate(), r.getEarthPollution());
        }

        model.addAttribute("listRegionInformation", regionInformationService.getAllRegionInformationByRegionName("Червоноградський"));
        model.addAttribute("surveyMapTemp", surveyMapTemp);
        model.addAttribute("surveyMapAir", surveyMapAir);
        model.addAttribute("surveyMapWater", surveyMapWater);
        model.addAttribute("surveyMapEarth", surveyMapEarth);
        return "/allRegions/sambir_region";
    }


    @GetMapping("/allRegions/stryii_region")
    public String viewStryiiRegionPage(@ModelAttribute("regionInformation") RegionInformation regionInformation, Model model) {
        Map<LocalDate, Integer> surveyMapTemp = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAir = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWater = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarth = new LinkedHashMap<>();

        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Стрийський")) {
            surveyMapTemp.put(r.getDate(), r.getTemperature());
            surveyMapAir.put(r.getDate(), r.getAirPollution());
            surveyMapWater.put(r.getDate(), r.getWaterPollution());
            surveyMapEarth.put(r.getDate(), r.getEarthPollution());
        }

        model.addAttribute("listRegionInformation", regionInformationService.getAllRegionInformationByRegionName("Червоноградський"));
        model.addAttribute("surveyMapTemp", surveyMapTemp);
        model.addAttribute("surveyMapAir", surveyMapAir);
        model.addAttribute("surveyMapWater", surveyMapWater);
        model.addAttribute("surveyMapEarth", surveyMapEarth);
        return "/allRegions/stryii_region";
    }

    @GetMapping("/allRegions/yavoriv_region")
    public String viewYavorivRegionPage(@ModelAttribute("regionInformation") RegionInformation regionInformation, Model model) {
        Map<LocalDate, Integer> surveyMapTemp = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAir = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWater = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarth = new LinkedHashMap<>();

        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Яворівський")) {
            surveyMapTemp.put(r.getDate(), r.getTemperature());
            surveyMapAir.put(r.getDate(), r.getAirPollution());
            surveyMapWater.put(r.getDate(), r.getWaterPollution());
            surveyMapEarth.put(r.getDate(), r.getEarthPollution());
        }

        model.addAttribute("listRegionInformation", regionInformationService.getAllRegionInformationByRegionName("Червоноградський"));
        model.addAttribute("surveyMapTemp", surveyMapTemp);
        model.addAttribute("surveyMapAir", surveyMapAir);
        model.addAttribute("surveyMapWater", surveyMapWater);
        model.addAttribute("surveyMapEarth", surveyMapEarth);
        return "/allRegions/yavoriv_region";
    }

    @GetMapping("/allRegions/zolochiv_region")
    public String viewZolochivRegionPage(@ModelAttribute("regionInformation") RegionInformation regionInformation, Model model) {
        Map<LocalDate, Integer> surveyMapTemp = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAir = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWater = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarth = new LinkedHashMap<>();

        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Золочівський")) {
            surveyMapTemp.put(r.getDate(), r.getTemperature());
            surveyMapAir.put(r.getDate(), r.getAirPollution());
            surveyMapWater.put(r.getDate(), r.getWaterPollution());
            surveyMapEarth.put(r.getDate(), r.getEarthPollution());
        }

        model.addAttribute("listRegionInformation", regionInformationService.getAllRegionInformationByRegionName("Червоноградський"));
        model.addAttribute("surveyMapTemp", surveyMapTemp);
        model.addAttribute("surveyMapAir", surveyMapAir);
        model.addAttribute("surveyMapWater", surveyMapWater);
        model.addAttribute("surveyMapEarth", surveyMapEarth);
        return "/allRegions/zolochiv_region";
    }

}
