package com.chams.hotel.HotelBook.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExceptionRepresentation {

    private String errorMessage;
    private String errorSource;
}
