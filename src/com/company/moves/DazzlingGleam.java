package com.company.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam() {
        super(Type.FAIRY, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        Status p_stat = def.getCondition();
        super.applyOppDamage(def, damage * 2);
    }

    @Override
    protected String describe() {
        return "использует Dazzling Gleam";
    }
}