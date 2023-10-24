package com.kanwar.spring6restmvcpreattempt.services;

import com.kanwar.spring6restmvcpreattempt.domain.Beer;
import com.kanwar.spring6restmvcpreattempt.domain.BeerStyle;
import com.kanwar.spring6restmvcpreattempt.repositories.BeerRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;

    public BeerServiceImpl(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public List<Beer> beer() {
        return (List<Beer>) beerRepository.findAll();
    }

    @Override
    public Beer getbeer(UUID uuid){
        return beerRepository.findById(uuid).get();
    }

    @Override
    public Beer postBeer(Beer beer){
        return beerRepository.save(beer);
    }

    @Override
    public Beer putBeer(UUID uuid, Beer beer){
        if(beerRepository.existsById(uuid)){
            Beer beerExisting = beerRepository.findById(uuid).get();
            if(!beer.getBeerName().isEmpty()) beerExisting.setBeerName(beer.getBeerName());
            System.out.println("PRINTING...."+beer.getBeerStyle());
            beerExisting.setUpc("Updated_via_API");
            beerExisting.setBeerStyle(BeerStyle.valueOf(beer.getBeerStyle().name()));
            beerRepository.save(beerExisting);
            return beerExisting;
        }else{
            return beer;
        }
    }
}
