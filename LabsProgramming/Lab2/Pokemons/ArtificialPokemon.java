package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public final class ArtificialPokemon extends Pokemon {
        public ArtificialPokemon(String name, int level) {
            super(name, level);
            setStats(80, 95, 115, 130, 115, 65);
            setType(Type.STEEL, Type.FAIRY);
            addMove(new ThunderWave());
            addMove(new StoneEdge());
            addMove(new Bulldoze());
            addMove(new PsychoCut());
        }
    }