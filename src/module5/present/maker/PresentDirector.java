package module5.present.maker;

import module5.present.store.Present;

public class PresentDirector {

    PresentMaker presentMaker;

    public PresentMaker getPresentMaker() {
        return presentMaker;
    }

    public void setPresentMaker(PresentMaker presentMaker) {
        this.presentMaker = presentMaker;
    }
    public Present makePresent() {
        presentMaker.createPresent();
        presentMaker.buildName();
        presentMaker.buildPrice();
        presentMaker.buildWrap();
        presentMaker.buildProducts();
        return presentMaker.getPresent();
    }
}
