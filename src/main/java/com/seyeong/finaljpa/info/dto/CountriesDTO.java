package com.seyeong.finaljpa.info.dto;

public class CountriesDTO {
    private int countriesId;
    private String countriesName;
    private String continent;

    public CountriesDTO() {
    }

    public CountriesDTO(int countriesId, String countriesName, String continent) {
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
