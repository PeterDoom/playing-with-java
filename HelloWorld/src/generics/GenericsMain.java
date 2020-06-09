package generics;

public class GenericsMain {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");

        Team<FootballPlayer> footballTeam = new Team<>("FootballTeam");
        footballTeam.addPlayer(joe);

        Team<BaseballPlayer> baseBallTeam = new Team<>("baseBallTeam");
        baseBallTeam.addPlayer(pat);

        System.out.println(footballTeam.numMembers());
        System.out.println(baseBallTeam.numMembers());
    }
}
