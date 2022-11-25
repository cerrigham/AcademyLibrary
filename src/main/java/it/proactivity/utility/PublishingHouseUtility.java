package it.proactivity.utility;

import it.proactivity.model.PublishingHouse;

public class PublishingHouseUtility {
    public static PublishingHouse createPublishingHouse(String id, String name, String nationality, String city,
                                                        String revenue, String foundator, String numberOfEmployees) {
        if(id == null || id.isEmpty() || name == null || name.isEmpty() || nationality == null || nationality.isEmpty()
                || city == null || city.isEmpty() || revenue == null || revenue.isEmpty() || foundator == null ||
                foundator.isEmpty() || numberOfEmployees == null || numberOfEmployees.isEmpty()) {
            throw new IllegalArgumentException("Parameters cannot be null");
        }

        Long parseId = ParsingUtility.parseLong(id);
        Float parseRevenue = ParsingUtility.parseFloat(revenue);
        Integer parseNumberOfEmployees = ParsingUtility.parseInteger(numberOfEmployees);
        if (parseId == null || parseRevenue == null || parseNumberOfEmployees == null) {
            return null;
        }

        return new PublishingHouse(parseId,name,nationality,city,parseRevenue,foundator,parseNumberOfEmployees);
    }
}
