package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public final class DeepSeaPokemon extends BivalvePokemon {
        public DeepSeaPokemon(String name, int level) {
            super(name, level);
            setStats(55, 104, 105, 94, 75, 52);
            setType(Type.WATER);
            addMove(new Crunch());
        }
    }