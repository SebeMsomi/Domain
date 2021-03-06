package za.ac.cput.Cricket.Factory;

import za.ac.cput.Cricket.Domain.Cricket;
import za.ac.cput.Cricket.util.CricketUtil;

public class CricketFactory {
    public static Cricket getCricket(String team1, String team2)
    {
        return new Cricket.Builder().(CricketUtil.gene())
                .team1(team1);
                .team2(team2)
            .build();
    }
}
