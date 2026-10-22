package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class SingleBloomPokemonFloette extends SingleBloomPokemonFlabebe {
        public SingleBloomPokemonFloette(String name, int level) {
            super(name, level);
            setStats(54, 45, 47, 75, 98, 52);
            setType(Type.FAIRY);
            addMove(new RazorLeaf());
        }
    }