package com.capstone.model;

import java.util.Objects;

public class UserAddress
{
    private String StreetLine1;
    private String StreetLine2;
    private String City;
    private String Country;

    public UserAddress() {
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "StreetLine1='" + StreetLine1 + '\'' +
                ", StreetLine2='" + StreetLine2 + '\'' +
                ", City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                ", Zipcode=" + Zipcode +
                '}';
    }

    private Integer Zipcode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAddress that = (UserAddress) o;
        return Objects.equals(StreetLine1, that.StreetLine1) && Objects.equals(StreetLine2, that.StreetLine2) && Objects.equals(City, that.City) && Objects.equals(Country, that.Country) && Objects.equals(Zipcode, that.Zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StreetLine1, StreetLine2, City, Country, Zipcode);
    }

    public void setStreetLine1(String streetLine1) {
        StreetLine1 = streetLine1;
    }

    public void setStreetLine2(String streetLine2) {
        StreetLine2 = streetLine2;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setZipcode(Integer zipcode) {
        Zipcode = zipcode;
    }

    public String getStreetLine1() {
        return StreetLine1;
    }

    public String getStreetLine2() {
        return StreetLine2;
    }

    public String getCity() {
        return City;
    }

    public String getCountry() {
        return Country;
    }

    public Integer getZipcode() {
        return Zipcode;
    }

    public UserAddress(String streetLine1, String streetLine2, String city, String country, Integer zipcode) {
        StreetLine1 = streetLine1;
        StreetLine2 = streetLine2;
        City = city;
        Country = country;
        Zipcode = zipcode;
    }
}
