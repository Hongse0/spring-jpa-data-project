package com.seyeong.finaljpa.info.repository;

import com.seyeong.finaljpa.info.entity.Countries;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountriesRepository extends JpaRepository<Countries, Integer> {
    @Query(value = "SELECT country_id,country_name,continent FROM countries ORDER BY country_id",nativeQuery = true)
    List<Countries> findAllCountries();


}
