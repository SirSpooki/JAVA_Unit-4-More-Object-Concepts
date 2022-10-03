import java.time.*;
public class TenThousandDaysOld {
    public static void main(String[] args) {
        
        LocalDate birth = LocalDate.of(2004, 10, 27);

        System.out.println("I will be 10000 days old on "+ birth.plusDays(10000));
    }
}
