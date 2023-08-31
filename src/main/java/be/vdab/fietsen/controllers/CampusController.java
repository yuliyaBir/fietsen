package be.vdab.fietsen.controllers;

import be.vdab.fietsen.dto.CampusBeknopt;
import be.vdab.fietsen.services.CampusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@RequestMapping("campussen")
public class CampusController {
    private final CampusService campusService;

    public CampusController(CampusService campusService) {
        this.campusService = campusService;
    }

    @GetMapping("westvlaams")
    Stream<CampusBeknopt> findWestVlaamse(){
        return campusService.findWestVlaamse()
                .stream().map(campus -> new CampusBeknopt(campus));
    }
}
