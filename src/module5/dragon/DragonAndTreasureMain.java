package module5.dragon;

import module5.dragon.treasures.Cave;
import module5.dragon.actions.ConsoleMenu;

public class DragonAndTreasureMain {
    public static Cave snakeGorynychcave = new Cave("Snake Gorynych");

    public static void main(String[] args) {
        ConsoleMenu consoleMenu = new ConsoleMenu();
        snakeGorynychcave.setNumberOfTreasure(100);
        consoleMenu.startConsoleMenu();
    }
}