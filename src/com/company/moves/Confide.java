package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e1 = new Effect().turns(1).stat(Stat.SPECIAL_ATTACK, -1);
        Effect e2 = new Effect().turns(1).stat(Stat.HP, 6);
        p.addEffect(e1);
        p.addEffect(e2);
    }

    @Override
    protected String describe() {
        return " использует  Confide";
    }
}
