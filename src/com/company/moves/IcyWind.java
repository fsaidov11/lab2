package com.company.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class IcyWind extends SpecialMove {
    public IcyWind() {
        super(Type.ICE, 55, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e1 = new Effect().turns(1).stat(Stat.SPEED, -1);
        p.addEffect(e1);
    }

    @Override
    protected String describe() {
        return " использует  Icy Wind";
    }
}
