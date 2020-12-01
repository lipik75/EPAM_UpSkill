package module5.present.maker;

import module5.present.store.Present;

public abstract class PresentMaker {

    Present present;

    void createPresent(){
        present = new Present();
    }
    abstract void buildName();
    abstract void buildPrice();
    abstract void buildWrap();
    abstract void buildProducts();

    public Present getPresent() {
        return present;
    }
}
