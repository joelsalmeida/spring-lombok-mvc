package phantom.spring_lombok_mvc.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import phantom.spring_lombok_mvc.model.Beer;
import phantom.spring_lombok_mvc.services.BeerService;

import java.util.UUID;

@Controller
@AllArgsConstructor
@Slf4j
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id) {
        log.debug("Get beer by id - Controller - id: " + id.toString());

        return beerService.getBeerById(id);
    }
}
