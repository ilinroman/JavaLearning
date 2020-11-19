package Day7;

/**
 * Дворовый футбол
 */
public class Task2 {
    public static void main(String[] args) {
        Player p1 = new Player("Игрок 1");
        Player p2 = new Player("Игрок 2");
        Player p3 = new Player("Игрок 3");
        Player p4 = new Player("Игрок 4");
        Player p5 = new Player("Игрок 5");
        Player.info();
        Player p6 = new Player("Игрок 6");
        Player.info();
        Player p7 = new Player("Игрок 7");

        while(true){
            if(!p1.run())
                break;
        }
        Player.info();
    }
}
