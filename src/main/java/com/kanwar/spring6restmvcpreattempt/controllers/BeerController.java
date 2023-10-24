package com.kanwar.spring6restmvcpreattempt.controllers;

import com.kanwar.spring6restmvcpreattempt.domain.Beer;
import com.kanwar.spring6restmvcpreattempt.services.BeerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @RequestMapping("/api/beer")
    public List<Beer> beer(){
        return beerService.beer();
    }

    @GetMapping("/api/beer/{uuid}")
    public Beer getbeer(@PathVariable UUID uuid){
        return beerService.getbeer(uuid);
    }

    @PostMapping("/api/beer")
    public Beer postbeer(@RequestBody Beer beer) {return beerService.postBeer(beer);}

    @PutMapping("api/beer/{uuid}")
    public Beer putBeer(@PathVariable UUID uuid, @RequestBody Beer beer){
        return beerService.putBeer(uuid, beer);
    }

}
