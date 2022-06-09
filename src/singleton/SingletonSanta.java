package singleton;

import command.Command;
import command.CreateBikeCommand;
import command.CreateDollCommand;
import entity.MagicBoard;
import entity.Toy;

import java.util.ArrayList;
import java.util.List;

public class SingletonSanta {

    private static SingletonSanta santaInstance;
    private List<Toy> bagOfToys = new ArrayList<>();

    private SingletonSanta (){

    }

    public static SingletonSanta getSantaInstance(){
        if(santaInstance == null){
            santaInstance = new SingletonSanta();
        }
        return santaInstance;
    }

    public void sayMagicWords(String wantedToy, MagicBoard magicBoard){
        Command command = null;

        if(wantedToy.equalsIgnoreCase("bmx")){
            command = new CreateBikeCommand(magicBoard);
        }

        if(wantedToy.equalsIgnoreCase("barbie")){
            command = new CreateDollCommand(magicBoard);
        }

        if (command == null){
            System.out.println("Invalid toy request");
        }

        command.execute();
    }

    public void addToyToBag(Toy toy){
        if(toy != null) {
            bagOfToys.add(toy);
        }else{
            System.out.println("toy cannot be null");
        }
    }

    public void showWhatToysAreInTheBag(){
        System.out.println("Santa has " + bagOfToys.size() + " toys in the bag");
        System.out.println("The toys in the bag are: ");
        for (Toy toy : bagOfToys){
            System.out.print(toy.getToyType() + " ");
        }
    }




}
