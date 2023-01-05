package com.example.game_capital;

public class CountryMapper {


    public static CountryDTO convertToDTO(Country entity){
        CountryDTO dto = new CountryDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }
}
