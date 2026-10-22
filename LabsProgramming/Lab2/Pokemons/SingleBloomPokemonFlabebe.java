package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class SingleBloomPokemonFlabebe extends Pokemon {
        public SingleBloomPokemonFlabebe(String name, int level) {
            super(name, level);
            setStats(44, 38, 39, 61, 79, 42);
            setType(Type.FAIRY);
            addMove(new Psychic());
            addMove(new Moonblast());
        }
    }