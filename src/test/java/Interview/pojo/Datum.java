package Interview.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Datum {
    @JsonProperty("id")
    public int id;
    @JsonProperty("street")
    public String street;
    @JsonProperty("streetName")
    public String streetName;
    @JsonProperty("buildingNumber")
    public String buildingNumber;
    @JsonProperty("city")
    public String city;
    @JsonProperty("zipcode")
    public String zipcode;
    @JsonProperty("country")
    public String country;
    @JsonProperty("county_code")
    public String county_code;
    @JsonProperty("latitude")
    public double latitude;
    @JsonProperty("longitude")
    public double longitude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty_code() {
        return county_code;
    }

    public void setCounty_code(String county_code) {
        this.county_code = county_code;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", streetName='" + streetName + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                ", county_code='" + county_code + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
