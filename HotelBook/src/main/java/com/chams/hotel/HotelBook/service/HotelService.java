package com.chams.hotel.HotelBook.service;

import com.chams.hotel.HotelBook.dto.HotelDto;
import com.chams.hotel.HotelBook.exception.HotelNotFoundException;
import com.chams.hotel.HotelBook.mappers.ObjectMappers;
import com.chams.hotel.HotelBook.model.Hotel;
import com.chams.hotel.HotelBook.repository.HotelRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class HotelService {

    private final HotelRepo hotelRepo;
    private final ObjectMappers mappers;

    public HotelDto addHotel(HotelDto hotel){
        Hotel hotelToSave = mappers.toHotel(hotel);
        Hotel savedhotel =  hotelRepo.save(hotelToSave);
        return mappers.toHotelDto(savedhotel);
    }

    public List<HotelDto> findAllHotel(){
        return hotelRepo.findAll().stream()
                .map(mappers::toHotelDto)
                .collect(Collectors.toList());
    }


    public HotelDto findHotelById(Long id) {
        Hotel hotelfinded =  hotelRepo.findHotelById(id).orElseThrow(HotelNotFoundException::new);
        return mappers.toHotelDto(hotelfinded);
    }

}
