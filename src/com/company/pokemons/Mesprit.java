package com.company.pokemons;

import com.company.moves.Confide;
import com.company.moves.DazzlingGleam;
import com.company.moves.ShadowBall;
import com.company.moves.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mesprit extends Pokemon {
    public Mesprit(String name, int level) {
        super(name, level);
        setStats(80, 105, 105, 105, 105, 80);
        setType(Type.PSYCHIC);
        setMove(new ShadowBall(), new DazzlingGleam(), new Confide(), new Thunder());
    }
}