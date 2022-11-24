package it.proactivity.model;

import java.util.Objects;

public class Address {

    private String houseNumber;
    private String street;
    private String municipality;
    private String province;
    private String nation;

    public Address() {}

    public Address(String houseNumber, String street, String municipality, String province, String nation) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.municipality = municipality;
        this.province = province;
        this.nation = nation;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(houseNumber, address.houseNumber) && Objects.equals(street, address.street)
                && Objects.equals(municipality, address.municipality) && Objects.equals(province, address.province)
                && Objects.equals(nation, address.nation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseNumber, street, municipality, province, nation);
    }

    @Override
    public String toString() {
        return "Address: " + houseNumber + " " + street  + " " + municipality + " " + province + " " + nation;
    }

    public static Address createAddress(String houseNumber, String street, String municipality, String province,
                                 String nation) {
        if(houseNumber == null || houseNumber.isEmpty() || street == null || street.isEmpty() || municipality == null ||
        municipality.isEmpty() || province == null || province.isEmpty() || nation == null || nation.isEmpty()) {
            throw new IllegalArgumentException("Parameters cannot be null");
        }

        return new Address(houseNumber, street, municipality, province, nation);
    }
}
