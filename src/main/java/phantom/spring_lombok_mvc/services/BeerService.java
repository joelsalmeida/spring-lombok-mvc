package phantom.spring_lombok_mvc.services;

import phantom.spring_lombok_mvc.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
}
