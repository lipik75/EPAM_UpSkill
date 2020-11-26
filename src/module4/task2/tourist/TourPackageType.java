package module4.task2.tourist;

public enum TourPackageType {
    RECREATION,
    EXCURSION,
    TREATMENT,
    SHOPPING,
    CRUISE;


    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
