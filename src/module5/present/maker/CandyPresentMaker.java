package module5.present.maker;

import module5.present.action.CustomerAction;
import module5.present.store.Wrap;

import java.util.ArrayList;

public class CandyPresentMaker extends PresentMaker{

    @Override
    void buildName() {
        String name = CustomerAction.checkInputName();
        present.setName(name);
    }

    @Override
    void buildPrice() {
        System.out.println("What price do you want to buy a gift for?");
        double price = CustomerAction.checkInputPrice();
        present.setPrice(price);
    }

    @Override
    void buildWrap() {
        Wrap wrap = CustomerAction.chooseWrap();
        present.setWrap(wrap);
    }

    @Override
    void buildProducts() {
        present.setProducts(new ArrayList<>());
    }
}
