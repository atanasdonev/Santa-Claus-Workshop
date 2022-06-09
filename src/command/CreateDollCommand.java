package command;

import entity.MagicBoard;

public class CreateDollCommand implements Command{

    private MagicBoard magicBoard;

    public CreateDollCommand(MagicBoard magicBoard){
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        magicBoard.displayRequestedToy("barbie");
    }
}
