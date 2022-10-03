import java.time.*;
public class TestMonthHandling
{
   public static void main(String[] args)
   {
      LocalDate jan31;
      jan31 = LocalDate.of(LocalDate.now().getYear(), 1, 31);
      LocalDate dec31; 
      dec31 = LocalDate.of(LocalDate.now().getYear(), 12, 31);

    
      System.out.println(jan31);
      System.out.println(jan31.plusMonths(1));
      System.out.println(jan31.plusMonths(2));
      System.out.println(jan31.plusMonths(3));
      System.out.println(dec31);
      System.out.println(dec31.plusMonths(1));
      System.out.println(dec31.plusMonths(2));
      System.out.println(dec31.plusMonths(3));

   }
}
