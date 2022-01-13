package com.company.pokemons;

import com.company.moves.LowSweep;

public class Lurantis extends Fomantis {
    public Lurantis(String name, int level) {
        super(name, level);
        setStats(70, 105, 90, 80, 90, 45);
        addMove(new LowSweep());
    }
}
