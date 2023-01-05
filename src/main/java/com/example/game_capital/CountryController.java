package com.example.game_capital;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("api")
public class CountryController {

@Autowired
    AnnuaireService annuaireService;

@GetMapping("game")

    public CountryDTO GetRandomCountry(Integer id){
    Random r = new Random();
     id = r.nextInt(53)+1;
     Optional<Country> op = annuaireService.getRandomCountry(id);
     Country country = op.get();
     CountryDTO dto = CountryMapper.convertToDTO(country);
     return dto;

}

public Boolean compareCapital(Integer id, Country country){
    Optional<Country> op = annuaireService.getRandomCountry(id);
    String capital= op.get().getCapital().toLowerCase();
    if(capital.equals(country.getCapital().toLowerCase())){
        return true;
    } else {
        return false;
    }

}


@PostMapping("game/{id}")
    public ResponseEntity DevineCapital(@PathVariable Integer id, @RequestBody Country country){


    if(compareCapital( id,country)== true){
        return ResponseEntity.ok().body("Gangé!");
    } else {
        return ResponseEntity.ok().body("Perdu!");
    }

}

}
