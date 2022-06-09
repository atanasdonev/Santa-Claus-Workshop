package factory;

import entity.Toy;

public abstract class ToyFactory {

    public abstract Toy createToy(String toyType);

    public Toy prepareToy(String toyType){
        Toy toy = createToy(toyType);
        toy.creatingToy();
        return toy;
    }
}
