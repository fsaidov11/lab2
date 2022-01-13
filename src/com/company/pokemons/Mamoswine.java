package com.company.pokemons;

import com.company.moves.IceBeam;

public class Mamoswine extends Piloswine {
    public Mamoswine(String name, int level) {
        super(name, level);
        setStats(110, 130, 80, 70, 60, 80);
        addMove(new IceBeam());
    }
}