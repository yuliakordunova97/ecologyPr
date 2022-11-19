package com.example.demo.controllers;

import com.example.demo.model.RegionInformation;
import com.example.demo.repository.RegionInformationRepository;
import com.example.demo.repository.ResultRepository;
import com.example.demo.service.RegionInformationService;
import com.example.demo.service.ResultService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ResultController {

    ResultRepository resultRepository;

    RegionInformationRepository regionInformationRepository;

    RegionInformationService regionInformationService;


//    @GetMapping("/showMoreInfo/{id}")
//    public String showMoreInfo(@PathVariable(value = "id") long id, Model model) {
//
//        RegionInformation regionInformation = regionInformationService.getRegionInformationById(id);
//        model.addAttribute("regionInformation", regionInformation);
//
//        return "showMoreInfo";
//    }

//    @GetMapping("/showMoreInfoMeth/{id}")
//    public String showMoreInfo(@PathVariable(value = "id") long id, Model model) {
//
//        RegionInformation regionInformation = regionInformationService.getRegionInformationById(id);
//        model.addAttribute("regionInformation", regionInformation);
//        return "showMoreInfo";
//    }
}
