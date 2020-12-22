package main.java.seabattlegame;

import java.util.ArrayList;
import java.util.List;

class Player {

    private String name;

    private BattleMap battleMap;

    private Player opponent;

    private List<GPS> shootingHistory;

    public Player(String name) {
        this.name = name;
        this.shootingHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public BattleMap getBattleMap() {
        return battleMap;
    }

    public void setBattleMap(BattleMap battleMap) {
        this.battleMap = battleMap;
    }

    public Player getOpponent() {
        return opponent;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public void addShotToHistory(GPS coordinate) throws CustomPlayerException {
        //Проверки
        if(checkShotingHistory(coordinate)) {
            throw new CustomPlayerException();
        }

        //Добавление в историю выстрелов
        shootingHistory.add(coordinate);
    }

    /**
     * Проверка наличия координат в истории выстрелов
     * @param coordinate
     * @return
     */
    public boolean checkShotingHistory (GPS coordinate) {
        for (GPS gps: shootingHistory) {
            if(gps.equals(coordinate))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
