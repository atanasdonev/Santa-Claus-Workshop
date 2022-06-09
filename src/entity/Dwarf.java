package entity;

import factory.BikeFactory;
import factory.DollFactory;
import observer.Observable;
import observer.Observer;
import singleton.SingletonSanta;

public class Dwarf implements Observer {
    private String name;
    private Observable magicBoard;
    private BikeFactory bikeFactory;
    private DollFactory dollFactory;

    public Dwarf(String name){
        this.name = name;
        bikeFactory = new BikeFactory();
        dollFactory = new DollFactory();
    }

    @Override
    public void update() {
        if(magicBoard == null){
            System.out.println("Invalid magic board");
        }
        String requestedToy = magicBoard.getRequestedToy();

        Toy preparedToy = null;

        if(requestedToy.equalsIgnoreCase("bmx")){
            preparedToy = bikeFactory.prepareToy(requestedToy);
        }

        if(requestedToy.equalsIgnoreCase("barbie")){
            preparedToy = dollFactory.prepareToy(requestedToy);
        }

        SingletonSanta.getSantaInstance().addToyToBag(preparedToy);
    }

    @Override
    public void setMagicBoard(Observable magicBoard) {
        this.magicBoard = magicBoard;
    }
}
