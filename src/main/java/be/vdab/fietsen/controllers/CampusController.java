package be.vdab.fietsen.controllers;

import be.vdab.fietsen.domain.Adres;
import be.vdab.fietsen.domain.Campus;
import be.vdab.fietsen.services.CampusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("campussen")
public class CampusController {
    private final CampusService campusService;

    public CampusController(CampusService campusService) {
        this.campusService = campusService;
    }
    private record CampusBeknopt(long id, String naam, Adres adres){
        private CampusBeknopt (Campus campus){
            this(campus.getId(), campus.getNaam(), campus.getAdres());
        }
    }
    @GetMapping("westvlaams")
    Stream<CampusBeknopt> findWestVlaamse(){
        return campusService.findWestVlaamse()
                .stream().map(campus -> new CampusBeknopt(campus));
    }
}
