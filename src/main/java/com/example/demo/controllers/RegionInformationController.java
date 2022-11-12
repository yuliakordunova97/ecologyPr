package com.example.demo.controllers;

import com.example.demo.model.RegionInformation;
import com.example.demo.service.RegionInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

@Controller
public class RegionInformationController {

    @Autowired
    private RegionInformationService regionInformationService;



    @GetMapping("/")
    public String viewHomePage(Model model) {

        return "main";
    }

    // display list of employees
    @GetMapping("/index")
    public String viewAllRegionPage(Model model) {
        Map<LocalDate, Integer> surveyMapL = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapD = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapZ = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapSam = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapSt = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapCh = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapYa = new LinkedHashMap<>();

        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Львівський")) {
            surveyMapL.put(r.getDate(), r.getTemperature());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Дрогобицький")) {
            surveyMapD.put(r.getDate(), r.getTemperature());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Золочівський")) {
            surveyMapZ.put(r.getDate(), r.getTemperature());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Самбірський")) {
            surveyMapSam.put(r.getDate(), r.getTemperature());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Стрийський")) {
            surveyMapSt.put(r.getDate(), r.getTemperature());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Червоноградський")) {
            surveyMapCh.put(r.getDate(), r.getTemperature());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Яворівський")) {
            surveyMapYa.put(r.getDate(), r.getTemperature());
        }
//        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Львівський")) {
//            surveyMapAir.put(r.getDate(), r.getAirPollution());
//        }
//        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Львівський")) {
//            surveyMapWater.put(r.getDate(), r.getWaterPollution());
//        }
//        model.addAttribute("listRegionInformation", regionInformationService.getAllRegionInformationByRegionName("Львівський"));
//        model.addAttribute("surveyMap", surveyMap);
//        model.addAttribute("surveyMapAir", surveyMapAir);
//        model.addAttribute("surveyMapWater", surveyMapWater);

        model.addAttribute("surveyMapL", surveyMapL);
        model.addAttribute("surveyMapD", surveyMapD);

        model.addAttribute("listRegionInformation", regionInformationService.getAllInformation());
        return "index";
    }

    @GetMapping("/showNewRegionInformationForm")
    public String showNewRegionInformationForm(Model model) {

        RegionInformation regionInformation = new RegionInformation();
        model.addAttribute("regionInformation", regionInformation);
        return "new_regionInformation";
    }

    @PostMapping("/saveRegionInformation")
    public String saveRegionInformation(@ModelAttribute("regionInformation") RegionInformation regionInformation) {

        regionInformationService.saveRegionInformation(regionInformation);

        return "redirect:/index/";
    }



    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        RegionInformation regionInformation = regionInformationService.getRegionInformationById(id);
        model.addAttribute("regionInformation", regionInformation);
        return "update_regionInformation";
    }

    @GetMapping("/deleteRegionInformation/{id}")
    public String deleteRegionInformation(@PathVariable(value = "id") long id) {

        this.regionInformationService.deleteRegionInformationById(id);
        return "redirect:/index/";
    }

    @GetMapping("/lviv_region")
    public String viewRegionPage(@ModelAttribute("regionInformation") RegionInformation regionInformation, Model model) {
        Map<LocalDate, Integer> surveyMap = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAir = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWater = new LinkedHashMap<>();
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Львівський")) {
            surveyMap.put(r.getDate(), r.getTemperature());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Львівський")) {
            surveyMapAir.put(r.getDate(), r.getAirPollution());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Львівський")) {
            surveyMapWater.put(r.getDate(), r.getWaterPollution());
        }
        model.addAttribute("listRegionInformation", regionInformationService.getAllRegionInformationByRegionName("Львівський"));
        model.addAttribute("surveyMap", surveyMap);
        model.addAttribute("surveyMapAir", surveyMapAir);
        model.addAttribute("surveyMapWater", surveyMapWater);
    return "lviv_region";
    }


}