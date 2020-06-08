package generics;

public class GenericsMain {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        Team footballTeam = new Team("FootballTeam");
        footballTeam.addPlayer(joe);
        System.out.println(footballTeam.numMembers());
    }
}
