package com.company.pokemons;

import com.company.moves.Confide;
import com.company.moves.Rest;
import com.company.moves.SweetScent;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Fomantis extends Pokemon {
    public Fomantis(String name, int level) {
        super(name, level);
        setStats(40, 55, 35, 50, 35, 35);
        setType(Type.GRASS);
        setMove(new Rest(), new SweetScent(), new Confide());
    }
}