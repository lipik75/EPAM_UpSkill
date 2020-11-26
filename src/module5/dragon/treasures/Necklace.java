package module5.dragon.treasures;

public class Necklace extends Treasure {
    private String descriptionOfTreasure;
    public Necklace(String treasureName, int treasureValue, String discriptionOfTreasure) {
        super.setName(treasureName);
        super.setValue(treasureValue);
        this.descriptionOfTreasure = discriptionOfTreasure;
    }

    @Override
    public String getDescriptionOfTreasure() {
        return null;
    }

    @Override
    public void setDescriptionOfTreasure(String descriptionOfTreasure) {

    }

    @Override
    public String toString() {
        return  String.format("%-15s %-40s value: %-5d description: %-40s", "Necklace:", super.getName(), super.getValue(),descriptionOfTreasure);
    }
}
