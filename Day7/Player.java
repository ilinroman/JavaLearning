package Day7;

import java.util.Random;

public class Player {
    public static final int MAX_STAMINA = 100; //максимальная выносливость
    public static final int MIN_STAMINA = 0; //минимальная выносливость
    public static final int START_MIN_STAMINA = 90; //минимальная стартовая выносливость

    private static int countPlayers = 0; //количество игроков на футбольном поле

    private String name; //имя игрока
    private int stamina; //выносливость

    /**
     * Игрок бежит при вызове этого метода. Этот метод уменьшает выносливость
     * на 1 при однократном вызове. Когда выносливость достигает 0, игроку нужен отдых и
     * он уходит с поля.
     * @return статус игрока
     */
    public boolean run() {
        boolean active = true;
        System.out.printf("Действие игрока \"%s\": %d -> %d \n",
            name,
            stamina,
            --stamina);
        if(stamina <= MIN_STAMINA) {
            leaveGame();
            active = false;
        }
        return active;
    }

    /**
     * Покинуть игру
     */
    public void leaveGame(){
        countPlayers--;
        System.out.println("Игрок покинул игру");
    }

    /**
     * Выводит сообщение в зависимости от количества игроков на поле. Если
     * игроков меньше 6, то выводит сообщение: “Команды неполные. На поле еще есть ...
     * свободных мест”, иначе: “На поле нет свободных мест”
     */
    public static void info() {
        if(countPlayers < 6)
            System.out.printf("Команды неполные. На поле еще есть %d свободных мест\n", 6 - countPlayers);
        else
            System.out.println("На поле нет свободных мест");
    }

    /**
     * Выпуск игрока с выносливостью от 90 до 100 на поле
     */
    public Player(String name) {
        Random r = new Random();
        this.name = name;
        this.stamina = START_MIN_STAMINA + r.nextInt(MAX_STAMINA - START_MIN_STAMINA + 1);
        if(countPlayers == 6){
            System.out.println("На поле нет мест! Создан запасной игрок \"" + name + "\" с выносливостью " + stamina);
        }
        else {
            countPlayers++;
            System.out.println("Создан игрок с выносливостью " + stamina);
        }
    }

    /**
     * Вывод выносливости игрока
     */
    public static void showStamina(Player p) {
        System.out.println(p.stamina);
    }
}
