package com.chams.hotel.HotelBook.controller;

import com.chams.hotel.HotelBook.dto.PaymentDto;
import com.chams.hotel.HotelBook.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/pay")
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping()
    public ResponseEntity<Float> payHotel(@RequestBody PaymentDto paymentDto){
        float result =  paymentService.paymentSum(paymentDto.getSum(),paymentDto.getNbrPerson(),paymentDto.getPrice());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
