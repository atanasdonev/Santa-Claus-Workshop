import entity.Dwarf;
import entity.MagicBoard;
import singleton.SingletonSanta;

public class Workshop {
    public MagicBoard magicBoard;
    public Dwarf Grumpy;
    public Dwarf Sleepy;
    public Dwarf Dopey;
    public static SingletonSanta santaClaus = SingletonSanta.getSantaInstance();

    public Workshop(){
        magicBoard = new MagicBoard();
        Grumpy = new Dwarf("Grumpy");
        Sleepy = new Dwarf("Sleepy");
        Dopey = new Dwarf("Dopey");
        magicBoard.subscribe(Grumpy);
        magicBoard.subscribe(Sleepy);
        magicBoard.subscribe(Dopey);
    }

    public MagicBoard getMagicBoard() {
        return magicBoard;
    }

    public static void main(String[] args) {
        Workshop workshop = new Workshop();
        santaClaus.sayMagicWords("BMX", workshop.getMagicBoard());
        santaClaus.sayMagicWords("Barbie", workshop.getMagicBoard());

        santaClaus.showWhatToysAreInTheBag();
    }
}
