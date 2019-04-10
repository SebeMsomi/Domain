package za.ac.cput.Cricket.Factory;

import za.ac.cput.Cricket.Domain.Player;

public class PlayerFactory {
    public static Player getPlayer(String name, int age)
    {
        return new Player.Builder().age(age)
                .name(name)
                .build();
    }
}
