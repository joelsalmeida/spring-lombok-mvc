package phantom.spring_lombok_mvc.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import phantom.spring_lombok_mvc.model.Beer;
import phantom.spring_lombok_mvc.model.BeerStyle;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {
        log.debug("Get beer by id - Service");

        return Beer.builder()
                .id(id)
                .version(3)
                .beerName("Extreme T")
                .beerStyle(BeerStyle.WHEAT)
                .upc("ZXC321654987")
                .price(new BigDecimal("17.70"))
                .quantityOnHand(7)
                .createDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}
