package com.chams.hotel.HotelBook.repository;

import com.chams.hotel.HotelBook.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,Long> {
    void deleteHotelById(Long id);
    Optional<Hotel> findHotelById(Long id);
}
