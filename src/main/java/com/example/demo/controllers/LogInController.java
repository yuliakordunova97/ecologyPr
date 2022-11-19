package com.example.demo.controllers;
import com.example.demo.model.RegionInformation;
import com.example.demo.service.IUserService;
import com.example.demo.service.RegionInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

@Controller
public class LogInController {

    @Autowired
    RegionInformationService regionInformationService;


    @GetMapping("/logIn")
    public String viewLogInPage(Model model) {

        return "logIn";
    }
    @GetMapping("/logInUser")
    public String viewLogInUserPage(Model model) {

        return "logInUser";
    }

    @GetMapping("/indexUser")
    public String viewInformationAboutregionByUser(Model model) {

        Map<LocalDate, Integer> surveyMapL = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapD = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapZ = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapSam = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapSt = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapCh = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapYa = new LinkedHashMap<>();

        Map<LocalDate, Integer> surveyMapAirL = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAirD = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAirZ = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAirSam = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAirSt = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAirCh = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAirYa = new LinkedHashMap<>();


        Map<LocalDate, Integer> surveyMapWaterL = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWaterD = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWaterZ = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWaterSam = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWaterSt = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWaterCh = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWaterYa = new LinkedHashMap<>();

        Map<LocalDate, Integer> surveyMapEarthL = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarthD = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarthZ = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarthSam = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarthSt = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarthCh = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarthYa = new LinkedHashMap<>();



        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Львівський")) {
            surveyMapL.put(r.getDate(), r.getTemperature());
            surveyMapAirL.put(r.getDate(), r.getAirPollution());
            surveyMapWaterL.put(r.getDate(), r.getWaterPollution());
            surveyMapEarthL.put(r.getDate(), r.getEarthPollution());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Дрогобицький")) {
            surveyMapD.put(r.getDate(), r.getTemperature());
            surveyMapAirD.put(r.getDate(), r.getAirPollution());
            surveyMapWaterD.put(r.getDate(), r.getWaterPollution());
            surveyMapEarthD.put(r.getDate(), r.getEarthPollution());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Золочівський")) {
            surveyMapZ.put(r.getDate(), r.getTemperature());
            surveyMapAirZ.put(r.getDate(), r.getAirPollution());
            surveyMapWaterZ.put(r.getDate(), r.getWaterPollution());
            surveyMapEarthZ.put(r.getDate(), r.getEarthPollution());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Самбірський")) {
            surveyMapSam.put(r.getDate(), r.getTemperature());
            surveyMapAirSam.put(r.getDate(), r.getAirPollution());
            surveyMapWaterSam.put(r.getDate(), r.getWaterPollution());
            surveyMapEarthSam.put(r.getDate(), r.getEarthPollution());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Стрийський")) {
            surveyMapSt.put(r.getDate(), r.getTemperature());
            surveyMapAirSt.put(r.getDate(), r.getAirPollution());
            surveyMapWaterSt.put(r.getDate(), r.getWaterPollution());
            surveyMapEarthSt.put(r.getDate(), r.getEarthPollution());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Червоноградський")) {
            surveyMapCh.put(r.getDate(), r.getTemperature());
            surveyMapAirCh.put(r.getDate(), r.getAirPollution());
            surveyMapWaterCh.put(r.getDate(), r.getWaterPollution());
            surveyMapEarthCh.put(r.getDate(), r.getEarthPollution());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Яворівський")) {
            surveyMapYa.put(r.getDate(), r.getTemperature());
            surveyMapAirYa.put(r.getDate(), r.getAirPollution());
            surveyMapWaterYa.put(r.getDate(), r.getWaterPollution());
            surveyMapEarthYa.put(r.getDate(), r.getEarthPollution());
        }


        model.addAttribute("surveyMapL", surveyMapL);
        model.addAttribute("surveyMapD", surveyMapD);
        model.addAttribute("surveyMapZ", surveyMapZ);
        model.addAttribute("surveyMapSam", surveyMapSam);
        model.addAttribute("surveyMapSt", surveyMapSt);
        model.addAttribute("surveyMapCh", surveyMapCh);
        model.addAttribute("surveyMapYa", surveyMapYa);

        model.addAttribute("surveyMapAirL", surveyMapAirL);
        model.addAttribute("surveyMapAirD", surveyMapAirD);
        model.addAttribute("surveyMapAirZ", surveyMapAirZ);
        model.addAttribute("surveyMapAirSam", surveyMapAirSam);
        model.addAttribute("surveyMapAirSt", surveyMapAirSt);
        model.addAttribute("surveyMapAirCh", surveyMapAirCh);
        model.addAttribute("surveyMapAirYa", surveyMapAirYa);


        model.addAttribute("surveyMapWaterL", surveyMapWaterL);
        model.addAttribute("surveyMapWaterD", surveyMapWaterD);
        model.addAttribute("surveyMapWaterZ", surveyMapWaterZ);
        model.addAttribute("surveyMapWaterSam", surveyMapWaterSam);
        model.addAttribute("surveyMapWaterSt", surveyMapWaterSt);
        model.addAttribute("surveyMapWaterCh", surveyMapWaterCh);
        model.addAttribute("surveyMapWaterYa", surveyMapWaterYa);


        model.addAttribute("surveyMapEarthL", surveyMapEarthL);
        model.addAttribute("surveyMapEarthD", surveyMapEarthD);
        model.addAttribute("surveyMapEarthZ", surveyMapEarthZ);
        model.addAttribute("surveyMapEarthSam", surveyMapEarthSam);
        model.addAttribute("surveyMapEarthSt", surveyMapEarthSt);
        model.addAttribute("surveyMapEarthCh", surveyMapEarthCh);
        model.addAttribute("surveyMapEarthYa", surveyMapEarthYa);



        model.addAttribute("listRegionInformation", regionInformationService.getAllInformation());
        return "indexUser";
    }


}
