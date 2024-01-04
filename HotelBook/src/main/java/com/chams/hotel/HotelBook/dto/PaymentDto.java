package com.chams.hotel.HotelBook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    private Integer sum;
    private Integer nbrPerson;
    private Long price;
}
