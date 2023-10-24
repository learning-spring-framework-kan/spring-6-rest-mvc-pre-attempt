package com.kanwar.spring6restmvcpreattempt.domain;

public enum BeerStyle {
    LAGER,
    PILSNER,
    STOUT,
    GOSE,
    PORTER,
    ALE,
    WHEAT,
    IPA,
    PALE_ALE,
    SAISON;


    public BeerStyle style(String s){
        return BeerStyle.valueOf(s);
    }
}
