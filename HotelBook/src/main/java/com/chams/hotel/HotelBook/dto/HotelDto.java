package com.chams.hotel.HotelBook.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HotelDto {
    private Long id;
    private String name;
    private String email;
    private String price;
    private String adress;
    private Integer category;
    private Integer roomnbr;
}
