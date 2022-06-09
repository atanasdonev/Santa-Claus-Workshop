package factory;

import entity.Doll;
import entity.Toy;

public class DollFactory extends ToyFactory{

    @Override
    public Toy createToy(String toyType) {
        if(toyType.equalsIgnoreCase("barbie")){
            return new Doll();
        }
        return null;
    }
}
