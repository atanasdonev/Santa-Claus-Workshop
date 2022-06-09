package entity;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {

    private String requestedToy;

    private List<Observer> dwarfsObservers;

    public MagicBoard(){
        dwarfsObservers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.dwarfsObservers.add(observer);
        observer.setMagicBoard(this);
    }

    @Override
    public void notifyObservers() {
            for (Observer dwarf : dwarfsObservers) {
                dwarf.update();
            }
    }

    @Override
    public String getRequestedToy() {
        return requestedToy;
    }

    public void displayRequestedToy(String santaRequest){
        requestedToy = santaRequest;
        System.out.println("Santa has requested: " + requestedToy.toUpperCase());
        System.out.println("Getting a " + requestedToy + " from the workshop");
        notifyObservers();
    }
}
