import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Meetup {

    private final int month;
    private final int year;

    public Meetup(int month, int year) {
        this.month = month;
        this.year  = year;
    }

    public DateTime day(int dayOfWeek, MeetupSchedule iteration) {
        List<DateTime> queryDates = new ArrayList<>();
        Integer startingDay = getStartingDay(iteration);
        DateTime result = new DateTime();
        buildDateList(queryDates, startingDay);
        for (DateTime date : queryDates) {
            if (date.dayOfWeek().get() == dayOfWeek) {
                result = date;
            }
        }
        return result;
    }

    private Integer getStartingDay(MeetupSchedule iteration) {
        if (iteration == MeetupSchedule.LAST) {
            return iteration.calculateLastSevenDays(month);
        } else {
            return iteration.startingDay();
        }
    }

    private void buildDateList(List<DateTime> queryDates, Integer startingDay) {
        for (int i = 0; i < 7; i++) {
            queryDates.add(new DateTime(year, month, startingDay + i, 0, 0));
        }
    }
}