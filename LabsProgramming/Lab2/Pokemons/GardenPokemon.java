package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public final class GardenPokemon extends SingleBloomPokemonFloette {
        public GardenPokemon(String name, int level) {
            super(name, level);
            setStats(78, 65, 68, 112, 154, 75);
            setType(Type.FAIRY);
            addMove(new DisarmingVoice());
        }
    }