package com.seyeong.finaljpa.info.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Countries {
    @Id
    @Column(name="country_id")
    private int countriesId;
    @Column(name="country_name")
    private String countriesName;
    @Column(name="continent")
    private String continent;

    public Countries() {
    }

    public Countries(int countriesId, String countriesName, String continent) {
        this.countriesId = countriesId;
        this.countriesName = countriesName;
        this.continent = continent;
    }

    public int getCountriesId() {
        return countriesId;
    }

    public void setCountriesId(int countriesId) {
        this.countriesId = countriesId;
    }

    public String getCountriesName() {
        return countriesName;
    }

    public void setCountriesName(String countriesName) {
        this.countriesName = countriesName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "CountriesDTO{" +
                "countriesId=" + countriesId +
                ", countriesName='" + countriesName + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }
}

