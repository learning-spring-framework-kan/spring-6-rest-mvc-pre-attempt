package com.kanwar.spring6restmvcpreattempt.initialdatasetup;

import com.kanwar.spring6restmvcpreattempt.domain.Beer;
import com.kanwar.spring6restmvcpreattempt.domain.BeerStyle;
import com.kanwar.spring6restmvcpreattempt.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class InsertData implements CommandLineRunner {

    public InsertData(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {

        Beer beer1 = Beer.builder()
//                .id(UUID.randomUUID())
                .beerName("Mango Bobs")
                .beerStyle(BeerStyle.ALE)
                .price(new BigDecimal("23.26"))
                .quantityOnHand(3028)
                .upc("1234")
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        Beer beer2 = Beer.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .price(new BigDecimal("69.11"))
                .quantityOnHand(870)
                .upc("9122089364369")
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        Beer beer3 = Beer.builder()
                .id(UUID.randomUUID())
                .beerName("No Hammers On The Bar")
                .beerStyle(BeerStyle.WHEAT)
                .price(new BigDecimal("51.37"))
                .quantityOnHand(778)
                .upc("0083783375213")
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        beerRepository.save(beer1);
        beerRepository.save(beer2);
        beerRepository.save(beer3);
    }
}
