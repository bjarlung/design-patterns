package Behavioral.Command;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {
    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(toggleCommand);

        System.out.println("________");

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);

        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
        lightSwitch.storeAndExecute(allLightsCommand);
        lightSwitch.storeAndExecute(allLightsCommand);

        /*
        //receiver
        Light light = new Light();
        //invoker
        Switch lightSwitch = new Switch();

        //Command to switch a light on and of
        Command toggleCommand = new ToggleCommand(light);

        lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(onCommand);

         */
    }
}
;