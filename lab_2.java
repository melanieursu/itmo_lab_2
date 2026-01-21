package lab_2;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Oricorio-Pom-Pom", 10);
        Pokemon p2 = new Pokemon("Clamperl", 10);
        Pokemon p3 = new Pokemon("Gorebyss", 10);
        Pokemon p4 = new Pokemon("Seedot", 10);
        Pokemon p5 = new Pokemon("Nuzleaf", 10);
        Pokemon p6 = new Pokemon("Shiftry", 10);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
