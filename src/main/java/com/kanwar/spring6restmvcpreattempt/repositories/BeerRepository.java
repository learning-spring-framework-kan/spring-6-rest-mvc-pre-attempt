package com.kanwar.spring6restmvcpreattempt.repositories;

import com.kanwar.spring6restmvcpreattempt.domain.Beer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BeerRepository extends CrudRepository<Beer, UUID> {
}
