public class FootballPlayerTest {
    public static void main(String[] args) {
        FootballPlayer player1 = new FootballPlayer();
        player1.no = 10;
        player1.name = "Alex";
        player1.inPlay = true;
        player1.minutes = 0;
        player1.numberOfGoals = 0;

        player1.play(20);
        System.out.println(player1.minutes); 
        player1.score();
        player1.score();
        System.out.println(player1.numberOfGoals); 
        
        player1.play(20);
        System.out.println(player1.minutes);
        
        player1.score();
        System.out.println(player1.numberOfGoals); 
    }
}