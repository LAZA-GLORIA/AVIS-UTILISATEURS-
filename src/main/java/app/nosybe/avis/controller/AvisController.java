package app.nosybe.avis.controller;

import app.nosybe.avis.dto.AvisDTO;
import app.nosybe.avis.service.avis.AvisService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/avis")
@RestController
@AllArgsConstructor
public class AvisController {

    private final AvisService avisService;

//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping()
//    public void creerAvis(@RequestBody AvisDTO avis) {
//        this.avisService.creer(avis);
//    }
}
