package com.chams.hotel.HotelBook.mappers;

import com.chams.hotel.HotelBook.dto.HotelDto;
import com.chams.hotel.HotelBook.model.Hotel;
import org.springframework.stereotype.Component;

@Component
public class ObjectMappers {

    public HotelDto toHotelDto(Hotel hotel){
        if(hotel==null){
            return null;
        }
        return HotelDto.builder()
                .id(hotel.getId())
                .name(hotel.getName())
                .email(hotel.getEmail())
                .price(hotel.getPrice())
                .adress(hotel.getAdress())
                .category(hotel.getCategory())
                .build();
    }

    public Hotel toHotel(HotelDto hoteldto){
        if(hoteldto==null){
            return null;
        }
        return Hotel.builder()
                .id(hoteldto.getId())
                .name(hoteldto.getName())
                .email(hoteldto.getEmail())
                .price(hoteldto.getPrice())
                .adress(hoteldto.getAdress())
                .category(hoteldto.getCategory())
                .build();
    }
}
