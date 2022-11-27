package it.proactivity.utility;

import it.proactivity.model.Address;

public class AddressUtility {
    public static Address createAddress(String houseNumber, String street, String municipality, String province,
                                        String nation) {
        if (houseNumber == null || houseNumber.isEmpty() || street == null || street.isEmpty() || municipality == null ||
                municipality.isEmpty() || province == null || province.isEmpty() || nation == null || nation.isEmpty()) {
            return null;
        }
        return new Address(houseNumber, street, municipality, province, nation);
    }
}
