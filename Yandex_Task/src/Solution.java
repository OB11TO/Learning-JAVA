import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Solution {
    private int x, y;

    Solution(int x, int y) {
        this.y = y;
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2015));

    }

    public static String findDay(int month, int day, int year) {
        LocalDate c = LocalDate.of(year, month, day);

            String s = String.valueOf(c.getDayOfWeek());
            return s;
    }
}
