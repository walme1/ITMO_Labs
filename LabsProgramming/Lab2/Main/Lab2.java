package Main;
import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public final class Lab2 {
    public static void main(String[] args) {
    Battle b = new Battle();
    ArtificialPokemon magearna = new ArtificialPokemon("Magearna", 30);
    BivalvePokemon clamperl = new BivalvePokemon("Clamperl", 1);
    DeepSeaPokemon huntail = new DeepSeaPokemon("Huntail", 34);
    SingleBloomPokemonFlabebe flabebe = new SingleBloomPokemonFlabebe("Flabebe", 41);
    SingleBloomPokemonFloette floette = new SingleBloomPokemonFloette("Floette", 41);
    GardenPokemon florges = new GardenPokemon("Florges", 19);

    b.addAlly(clamperl);
    b.addFoe(huntail);
    b.addAlly(magearna);
    b.addFoe(flabebe);
    b.addAlly(floette);
    b.addFoe(florges);
    b.go();
    }
}