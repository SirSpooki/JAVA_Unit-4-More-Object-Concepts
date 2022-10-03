public class TestTeam
{
   public static void main(String[] args)
   {
      Team team1 = new Team("Roosevelt High", "Girls Basketball", "Dolphins");
      Team team2 = new Team("Hoover High", "Boys Wrestling", "Tigers");
      Team team3 = new Team ("Lincoln High", "Girls Field Hockey", "Gators");
      display(team1);
      display(team2);
      display(team3);
   }
   public static void display(Team t)
   {
      System.out.println(t.getName() + " " + t.getSport() +
         " team " + t.getMascot() + "\n   Our motto is " +
         t.MOTTO);
   }
}
//Fernandos Mom Is an L Bozo
