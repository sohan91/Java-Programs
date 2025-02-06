record BaseBallPlayer(String player,String position){}
public class Main {
    public static void main(String[] args) {

        BaseBallTeam team1  = new BaseBallTeam("INDIAn");
        BaseBallTeam team2 = new BaseBallTeam("Australian");
        getScore(team1,3,team2,5);
        var marsh = new BaseBallPlayer("Marsh","Roight Corner");
        var mark = new BaseBallPlayer("C.Markus","Middle Passer");
        var sukesh = new BaseBallPlayer("B.Sukesh","Goal Keeper");
        var green = new BaseBallPlayer("Stev.Green","Goal Passer");
        team1.addTeamMemeber(marsh);
        team1.addTeamMemeber(mark);
        team2.addTeamMemeber(sukesh);
        team2.addTeamMemeber(green);
        team1.listOfTeamMember();
        team2.listOfTeamMember();
    }
    public static void getScore(BaseBallTeam team1,int team1_score,BaseBallTeam team2,int team2_score)
    {
        String message = team1.setScore(team1_score,team2_score);
        team2.setScore(team2_score,team1_score);
        System.out.printf("%s %s %s \n",team1,message,team2);
    }
}
