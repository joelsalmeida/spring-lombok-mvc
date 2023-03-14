package phantom.spring_lombok_mvc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import phantom.spring_lombok_mvc.services.BeerService;

@Controller
@AllArgsConstructor
public class BeerController {
    private final BeerService beerService;
}
