package com.app.das.web.controller;
    import com.app.das.model.Location;
    import com.app.das.service.LocationService;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
    import com.app.das.model.Grad;
    import com.app.das.service.GradService;
    import org.springframework.web.multipart.MultipartFile;
    import java.util.List;
    import java.io.IOException;
@Controller
@RequestMapping("/all")
public class AllController {
    private final LocationService locationService;
    private final GradService gradService;
    public AllController(LocationService locationService, GradService gradService) {
        this.locationService = locationService;
        this.gradService = gradService;
    }
    @GetMapping
    public String listAllLocationsPage(Model model) {
        List<Location> locations = this.locationService.findAll();
        model.addAttribute("siteLokacii", locations);
        return "all";
    }
}