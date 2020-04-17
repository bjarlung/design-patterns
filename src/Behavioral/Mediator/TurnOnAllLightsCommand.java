package Behavioral.Mediator;

import java.util.List;

//Concrete command
public class TurnOnAllLightsCommand implements Command {

    private Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
