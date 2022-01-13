package com.company.pokemons;

import com.company.moves.Confide;
import com.company.moves.IceBeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swinub extends Pokemon {
    public Swinub(String name, int level) {
        super(name, level);
        setStats(50, 50, 40, 30, 30, 50);
        setType(Type.ICE, Type.GROUND);
        setMove(new Confide(), new IceBeam());
    }
}
