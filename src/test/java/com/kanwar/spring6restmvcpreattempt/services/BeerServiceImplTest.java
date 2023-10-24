package com.kanwar.spring6restmvcpreattempt.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeerServiceImplTest {

    @Autowired
    BeerService beerService;

    @Test
    void beers() {
        System.out.println(beerService.beer().size());
    }
}