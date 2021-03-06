package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {
    public LowSweep() {
        super(Type.FIGHTING, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e1 = new Effect().turns(1).stat(Stat.SPEED, -1);
        p.addEffect(e1);
    }

    @Override
    protected String describe() {
        return " использует  Low Sweep";
    }
}