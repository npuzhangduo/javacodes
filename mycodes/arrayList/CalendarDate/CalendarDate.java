// The CalendarDate class stores information about a single
// calendar data (mouth and day but not year).

public class CalendarDate implements Comparable<CalendarDate> {
    private int mouth;
    private int day;

    public CalendarDate(int mouth, int day) {
        this.mouth = mouth;
        this.day = day;
    }

    // Compares this calendar data to another date.
    // Dates are compared by mouth and then by day
    public int compareTo(CalendarDate other) {
        if (mouth != other.mouth) {
            return mouth - other.mouth;
        } else {
            return day- other.day;
        }
    }

    public int getMonth() {
        return mouth;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
         String res = mouth + "/" + day;
         return res;
    }
}