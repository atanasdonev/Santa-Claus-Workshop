package command;

import entity.MagicBoard;

public class CreateBikeCommand implements Command{

    private MagicBoard magicBoard;

    public CreateBikeCommand(MagicBoard magicBoard){
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        magicBoard.displayRequestedToy("bmx");
    }
}
