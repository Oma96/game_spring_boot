package com.example.game_capital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AnnuaireService {

    @Autowired
    CountryRepository countryRepository;




public Optional<Country> getRandomCountry(Integer id){

    return  countryRepository.findById(id);
}


}
