package com.company.moves;


import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove {
    public SweetScent() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e1 = new Effect().turns(1).stat(Stat.EVASION, -2);
        p.addEffect(e1);
    }

    @Override
    protected String describe() {
        return " использует  Sweer Scent";
    }
}
