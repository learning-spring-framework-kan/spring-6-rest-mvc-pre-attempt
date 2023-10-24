package com.kanwar.spring6restmvcpreattempt.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String beerName;
    @Enumerated(EnumType.STRING)
    private BeerStyle beerStyle;
    private String upc;
    private BigDecimal price;
    private Integer version;
    private Integer quantityOnHand;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
