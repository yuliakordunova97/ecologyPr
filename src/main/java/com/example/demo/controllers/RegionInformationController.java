package com.example.demo.controllers;

import com.example.demo.model.RegionInformation;
import com.example.demo.model.Result;
import com.example.demo.service.RegionInformationService;
import com.example.demo.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;

@Controller
public class RegionInformationController {

    @Autowired
    private RegionInformationService regionInformationService;

    @Autowired
    private ResultService resultService;


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

        Result result = new Result();

        if(regionInformation.getAirPollution() == 0){
            result.setAirPollutionResult("добрий");
        }else if(regionInformation.getAirPollution()> 0 && regionInformation.getAirPollution()<= 12){
            result.setAirPollutionResult("задовільний");
        }else if(regionInformation.getAirPollution()> 12 && regionInformation.getAirPollution()<= 35){
            result.setAirPollutionResult("шкідливий");
        }else{
            result.setAirPollutionResult("небезпечний");
        }

        if(regionInformation.getWaterPollution() < 3){
            result.setWaterPollutionResult("не придатна");
        }else if(regionInformation.getWaterPollution()>= 3 && regionInformation.getWaterPollution()<5){
            result.setWaterPollutionResult("не рекомендована");
        }else if(regionInformation.getWaterPollution()>= 5 && regionInformation.getWaterPollution()<=6){
            result.setWaterPollutionResult("рекомендована");
        }else if(regionInformation.getWaterPollution()> 6 && regionInformation.getWaterPollution()<= 8){
            result.setWaterPollutionResult("не рекомендована");
        }else if(regionInformation.getWaterPollution()> 8 && regionInformation.getWaterPollution()<=9){
            result.setWaterPollutionResult("не рекомендована");
        }else{
            result.setWaterPollutionResult("не придатна");
        }

        if(regionInformation.getEarthPollution()>=4 && regionInformation.getEarthPollution()<=8){
            result.setEarthPollutionResult("придатний");
        }else{
            result.setEarthPollutionResult("токсичний");
        }
        result.setRegionInformation(regionInformation);

        resultService.saveResult(result);


        return "redirect:/indexUser/";
    }



    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        RegionInformation regionInformation = regionInformationService.getRegionInformationById(id);
        model.addAttribute("regionInformation", regionInformation);
        return "update_regionInformation";
    }

    @GetMapping("/showMoreInformation/{id}")
    public String showMoreInformation(@PathVariable(value = "id") long id, Model model) {

        RegionInformation regionInformation = regionInformationService.getRegionInformationById(id);
//        Result result = new Result();
//
//        String airPollution;
//        String waterPollution;
//        String earthPollution;
//
//
//        if(regionInformation.getAirPollution() == 0){
//            airPollution = "Такий показник концентрації PM вважається добрим для навколишнього повітря.";
//            result.setAirPollutionResult("добрий");
//        }else if(regionInformation.getAirPollution()> 0 && regionInformation.getAirPollution()<= 12){
//            airPollution = "Такий показник концентрації PM вважається задовільним для навколишнього повітря.";
//            result.setAirPollutionResult("задовільний");
//        }else if(regionInformation.getAirPollution()> 12 && regionInformation.getAirPollution()<= 35){
//            airPollution = "Такий показник концентрації PM вважається шкідливим для групи ризику.";
//            result.setAirPollutionResult("шкідливий");
//        }else{
//            airPollution = "Такий показник концентрації PM вважається небезпечним. ";
//            result.setAirPollutionResult("небезпечний");
//        }
//
//
//        if(regionInformation.getWaterPollution() < 3){
//            waterPollution = "Вода не придатна для споживання (сильно кисла).";
//            result.setWaterPollutionResult("не придатна");
//        }else if(regionInformation.getWaterPollution()>= 3 && regionInformation.getWaterPollution()<5){
//            waterPollution = "Вода не рекомендована для споживання (кисла).";
//            result.setWaterPollutionResult("не рекомендована");
//        }else if(regionInformation.getWaterPollution()>= 5 && regionInformation.getWaterPollution()<=6){
//            waterPollution = "Вода рекомендована для споживання, проте все ж має слабокислий присмак.";
//            result.setWaterPollutionResult("рекомендована");
//        }else if(regionInformation.getWaterPollution()> 6 && regionInformation.getWaterPollution()<= 8){
//            waterPollution = "Вода не рекомендована до вживання.";
//            result.setWaterPollutionResult("не рекомендована");
//        }else if(regionInformation.getWaterPollution()> 8 && regionInformation.getWaterPollution()<=9){
//            waterPollution = "Вода не рекомендована для споживання (слаболужна).";
//            result.setWaterPollutionResult("не рекомендована");
//        }else{
//            waterPollution = "Вода не придатна для споживання (сильно лужна).";
//            result.setWaterPollutionResult("не придатна");
//        }
//
//
//        if(regionInformation.getEarthPollution()>=4 && regionInformation.getEarthPollution()<=8){
//            earthPollution = "Даний рівень рН для більшості рослин є придатним.";
//            result.setEarthPollutionResult("придатний");
//        }else{
//            earthPollution = "Даний рівень рН є токсичним для коренів рослин.";
//            result.setEarthPollutionResult("токсичний");
//        }
//        result.setRegionInformation(regionInformation);
//
//
//        resultService.saveResult(result);

        model.addAttribute("regionInformation", regionInformation);
//        model.addAttribute("airPollution", airPollution);
//        model.addAttribute("waterPollution", waterPollution);
//        model.addAttribute("earthPollution", earthPollution);
        return "showMoreInfo";
    }

    @GetMapping("/deleteRegionInformation/{id}")
    public String deleteRegionInformation(@PathVariable(value = "id") long id) {

        this.regionInformationService.deleteRegionInformationById(id);
        return "redirect:/indexUser/";
    }

    @GetMapping("/lviv_region")
    public String viewRegionPage(@ModelAttribute("regionInformation") RegionInformation regionInformation, Model model) {
        Map<LocalDate, Integer> surveyMapTemp = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapAir = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapWater = new LinkedHashMap<>();
        Map<LocalDate, Integer> surveyMapEarth = new LinkedHashMap<>();
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Львівський")) {
            surveyMapTemp.put(r.getDate(), r.getTemperature());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Львівський")) {
            surveyMapAir.put(r.getDate(), r.getAirPollution());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Львівський")) {
            surveyMapWater.put(r.getDate(), r.getWaterPollution());
        }
        for (RegionInformation r: regionInformationService.getAllRegionInformationByRegionName("Львівський")) {
            surveyMapEarth.put(r.getDate(), r.getEarthPollution());
        }
        model.addAttribute("listRegionInformation", regionInformationService.getAllRegionInformationByRegionName("Львівський"));
        model.addAttribute("surveyMapTemp", surveyMapTemp);
        model.addAttribute("surveyMapAir", surveyMapAir);
        model.addAttribute("surveyMapWater", surveyMapWater);
        model.addAttribute("surveyMapEarth", surveyMapEarth);
    return "lviv_region";
    }


}