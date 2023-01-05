package com.example.game_capital;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GameCapitalApplicationTests {

    @Autowired AnnuaireService annuaireService;
    @Autowired CountryController countryController;

    @Test
    void testDevineCapital(){
        Optional<Country> op = annuaireService.getRandomCountry(3);

        assertEquals("",r);

    }

}
