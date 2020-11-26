package module5.dragon.actions;

import module5.dragon.DragonAndTreasureMain;
import module5.dragon.treasures.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureAction {
    void showAllTreasure() {
        int id = 1;
        for (Treasure element : DragonAndTreasureMain.snakeGorynychcave.getTreasures()) {
            System.out.println(String.format("%-3d %-100s", id++, element));
        }
        System.out.println();
    }

    void chooseMostExpensive() {
        int highestPrice = 0;
        Treasure treasure = null;
        for (Treasure element : DragonAndTreasureMain.snakeGorynychcave.getTreasures()) {
            if(element.getValue() > highestPrice) {
                highestPrice = element.getValue();
                treasure = element;
            }
        }
        System.out.println(treasure + "\n");

    }

    void selectForGivenAmount(int [] valueRange) {
        List<Treasure> treasures = new ArrayList<>();
        for (Treasure element : DragonAndTreasureMain.snakeGorynychcave.getTreasures()) {
            if (element.getValue() >= valueRange[0] && element.getValue() <= valueRange[1]) {
                treasures.add(element);
            }
        }
        if(treasures.size() == 0) {
            System.out.println("No options found.\n");
            return;
        }
        int id = 1;
        for (Treasure element : treasures) {
            System.out.println(String.format("%-3d %-100s", id++, element));
        }
        System.out.println();
    }

    public List<Treasure> fillCaveWithTreasures(int numberOfTreasure) {
        List<Treasure> treasures = new ArrayList<>();
        try {
//            FileReader fileReader = new FileReader("data/treasure_list.txt");
            FileReader fileReader = new FileReader("src/module5/data/treasures_list.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine() && numberOfTreasure-- > 0) {
                String [] treasureLine = scanner.nextLine().split(" - ");
                String treasureType = treasureLine[0];
                String treasureName = treasureLine[1];
                int treasureValue = Integer.parseInt(treasureLine[2]);
                String descriptionOfTreasure = treasureLine[3];
                switch (treasureType) {
                    case "Porcelain":
                        treasures.add(new Porcelain(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Necklace":
                        treasures.add(new Necklace(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Coin":
                        treasures.add(new Coin(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Gem":
                        treasures.add(new Gem(treasureName, treasureValue, descriptionOfTreasure));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Treasure information file not found.");
        }
        return treasures;
    }
}
