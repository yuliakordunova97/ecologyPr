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


    @GetMapping("/logIn")
    public String viewLogInPage(Model model) {

        return "/logIn";
    }


}
