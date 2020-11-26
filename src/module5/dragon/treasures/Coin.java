package module5.dragon.treasures;

public class Coin extends Treasure {
    private String descriptionOfTreasure;

    public Coin(String treasureName, int treasureValue, String descriptionOfTreasure) {
        super.setName(treasureName);
        super.setValue(treasureValue);
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public String getDescriptionOfTreasure() {
        return descriptionOfTreasure;
    }

    @Override
    public void setDescriptionOfTreasure(String descriptionOfTreasure) {
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-40s value: %-5d description: %-40s", "Coin:", super.getName(), super.getValue(), descriptionOfTreasure);
    }
}
