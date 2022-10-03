import java.time.LocalDate;

public class DaysTilNextMonth {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        int nextMonth = 1 + (localDate.getMonthValue() % 12);
        LocalDate nextMonthDate = LocalDate.of(localDate.getYear(), nextMonth, localDate.getDayOfMonth());
        int days = localDate.lengthOfMonth() - localDate.getDayOfMonth() + 1;
        System.out.println("There are " + days + " days until " + nextMonthDate.getMonth().name() + " starts.");
    }

}
