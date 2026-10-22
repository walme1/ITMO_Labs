package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class BivalvePokemon extends Pokemon {
        public BivalvePokemon(String name, int level) {
        super(name, level);
        setStats(35, 64, 85, 74, 55, 32);
        setType(Type.WATER);
        addMove(new Waterfall());
        addMove(new WaterPulse());
        addMove(new Rest());
        }
    }