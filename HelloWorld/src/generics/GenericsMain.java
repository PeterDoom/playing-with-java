package generics;

public class GenericsMain {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        BasketballPlayer lebron = new BasketballPlayer("LeBron");
        BasketballPlayer dennis = new BasketballPlayer("Dennis");

        Team<FootballPlayer> footballTeam = new Team<>("FootballTeam");
        footballTeam.addPlayer(joe);

        Team<BaseballPlayer> baseBallTeam = new Team<>("baseBallTeam");
        baseBallTeam.addPlayer(pat);

        Team<BasketballPlayer> basketballTeam = new Team<>("basketballTeam");
        Team<BasketballPlayer> basketballTeamTwo = new Team<>("basketballTeamTwo");
        basketballTeam.addPlayer(lebron);
        basketballTeamTwo.addPlayer(dennis);

        basketballTeam.matchResult(basketballTeamTwo, 12, 35);

        System.out.println(footballTeam.numMembers());
        System.out.println(baseBallTeam.numMembers());
    }
}
