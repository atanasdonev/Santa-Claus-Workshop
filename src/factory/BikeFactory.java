package factory;

import entity.Bike;
import entity.Toy;

public class BikeFactory extends ToyFactory{

    @Override
    public Toy createToy(String toyType) {
        if(toyType.equalsIgnoreCase("bmx")){
            return new Bike();
        }

        return null;
    }
}
