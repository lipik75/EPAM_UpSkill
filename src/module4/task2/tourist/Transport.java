package module4.task2.tourist;

public enum Transport {
    PLANE,
    BUS,
    TRAIN,
    SHIP,
    CAR;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
