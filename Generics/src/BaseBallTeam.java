import java.util.ArrayList;
import java.util.List;

public class BaseBallTeam {
    private String teamName;
    private List<BaseBallPlayer> teamMemebers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
 public BaseBallTeam(String teamName)
 {
     this.teamName = teamName;
 }

 public void addTeamMemeber(BaseBallPlayer player)
 {
     if(!teamMemebers.contains(player))
     {
         teamMemebers.add(player);
     }
 }
   public void listOfTeamMember()
   {
       System.out.println(teamName.toUpperCase()+" Rosters ");
       System.out.println(teamMemebers);
   }
   public int ranking()
   {
       return (totalLosses * 2) + totalTies+1;
   }
   public String setScore(int ourScore,int otherScore)
   {
       String message = "lost with";
       if(ourScore > otherScore)
       {
           totalWins++;
           message = "beats to ";
       } else if (ourScore == otherScore) {
           totalTies++;
           message = "ties";
       }
       else
       {
           totalLosses++;
       }
       return message;
   }
   public String toString()
   {
       return teamName+"( Ranked "+ranking()+")";
   }
}
