package com.chams.hotel.HotelBook.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    public float paymentSum(Integer sum, Integer nbrPerson, Long price){
        Long sumHT = nbrPerson*price;
        float Tax = (float)(sumHT*19)/100;
        return sumHT+Tax;
    }
}
