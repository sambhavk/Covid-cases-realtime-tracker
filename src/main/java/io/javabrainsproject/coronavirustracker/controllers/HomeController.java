package io.javabrainsproject.coronavirustracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.javabrainsproject.coronavirustracker.models.LocationStats;
import io.javabrainsproject.coronavirustracker.services.CoronaVirusDataService;

@Controller
public class HomeController {
    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int sum = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        model.addAttribute("allStats", allStats);
        model.addAttribute("totalCasesReported", sum);
        return "home";
    }
}
