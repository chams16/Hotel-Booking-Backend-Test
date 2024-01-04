package com.chams.hotel.HotelBook.controller;

import com.chams.hotel.HotelBook.dto.HotelDto;
import com.chams.hotel.HotelBook.model.Hotel;
import com.chams.hotel.HotelBook.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/hotel")
public class HotelController {

    private final HotelService hotelService;

    @GetMapping("/all")
    public ResponseEntity<List<HotelDto>> findAllHotel(){
        List<HotelDto> hotels = hotelService.findAllHotel();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<HotelDto> findHotelById(@PathVariable("id") Long id){
        HotelDto hotel = hotelService.findHotelById(id);
        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<HotelDto> addHotel(@RequestBody HotelDto hotel){
        HotelDto newHotel = hotelService.addHotel(hotel);
        return new ResponseEntity<>(newHotel,HttpStatus.CREATED);
    }


}
