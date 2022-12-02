package it.proactivity.utility;

import it.proactivity.model.LibraryDetail;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LibraryDetailUtility {

    public Map<DayOfWeek, List<LocalTime>> openingDaysAndHourstoLocalDateTime(LibraryDetail libraryDetail) {

        if (libraryDetail == null) {
            return null;
        }

        Map<DayOfWeek, List<LocalTime>> mapOpeningDaysAndHourstoLocalDateTime = new HashMap<>();

        try {
            for (Map.Entry<String, String> entry : libraryDetail.getOpeningDaysAndHours().entrySet()) {
                DayOfWeek dayOfWeek = DayOfWeek.valueOf(entry.getKey().toUpperCase());

                List<LocalTime> localDateTimeList = new LinkedList<>();
                String[] arrayOpeningHour = entry.getValue().split(";");
                String[] morningOpeningHour = arrayOpeningHour[0].split("-");
                String[] afternoonOpeningHour = arrayOpeningHour[1].split("-");

                for (String s : morningOpeningHour) {
                    LocalTime time = ParsingUtility.parseTime(s);
                    if (time == null) {
                        return null;
                    }
                    localDateTimeList.add(time);
                }

                for (String s : afternoonOpeningHour) {
                    LocalTime time = ParsingUtility.parseTime(s);
                    if (time == null) {
                        return null;
                    }
                    localDateTimeList.add(time);
                }
                mapOpeningDaysAndHourstoLocalDateTime.put(dayOfWeek, localDateTimeList);
            }
            return mapOpeningDaysAndHourstoLocalDateTime;
        } catch (Exception e) {

            return null;
        }

    }
}
