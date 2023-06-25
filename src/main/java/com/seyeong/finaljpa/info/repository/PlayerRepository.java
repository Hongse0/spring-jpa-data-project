package com.seyeong.finaljpa.info.repository;

import com.seyeong.finaljpa.info.entity.Countries;
import com.seyeong.finaljpa.info.entity.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Players, Integer> {
    @Query("SELECT p FROM Players p WHERE p.country.countriesId = :countryId")
    List<Players> findCountryPlayer(@Param("countryId") Integer countryId);


    List<Players> findByCountry(Countries country);
}
