import java.time.*;
public class FitnessTracker {
    String activity;
    int minutes;
    LocalDate date;
    // constructor for 3a
    public FitnessTracker() 
    {
        activity = "running";
        minutes = 0;
        date = LocalDate.of(2022,1,1);
    }
    // constructor for 3b
    public FitnessTracker(String a, int m, LocalDate d) 
    {
        activity = a;
        minutes = m;
        date = d;
    }
    public String getActivity() 
    {
        return activity;     
    }
    public int getMinutes() 
    {
        return minutes;
    }
    public LocalDate getDate() 
    {
        return date;
    }
}
