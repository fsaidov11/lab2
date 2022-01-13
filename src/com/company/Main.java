package com.company;

import com.company.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

class Main {
    public static void main(String args[]) {
        Battle b = new Battle();

        Mesprit p1 = new Mesprit("Батя", 1);
        Fomantis p2 = new Fomantis("Брат", 2);
        Lurantis p3 = new Lurantis("Зять", 2);
        Swinub p4 = new Swinub("Дед", 1);
        Piloswine p5 = new Piloswine("Дядя", 3);
        Mamoswine p6 = new Mamoswine("Сосед", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}