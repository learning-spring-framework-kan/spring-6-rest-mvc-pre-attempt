package com.kanwar.spring6restmvcpreattempt.services;

import com.kanwar.spring6restmvcpreattempt.domain.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {

    List<Beer> beer();

    Beer getbeer(UUID uuid);

    Beer postBeer(Beer beer);

    Beer putBeer(UUID uuid, Beer beer);
}
