import ru.ifmo.se.pokemon.*;

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
    public static final class ArtificialPokemon extends Pokemon {
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
    public static final class ThunderWave extends StatusMove {
        public ThunderWave() {
            super(Type.ELECTRIC, 0, 90);
        }
        @Override 
        protected void applyOppEffects(Pokemon def) {
            Effect.paralyze(def);
        }
    }
    public static final class StoneEdge extends PhysicalMove {
        public StoneEdge() {
            super(Type.ROCK, 100, 80);
        }
        @Override 
        protected double calcCriticalHit(Pokemon att, Pokemon def) {
            if (Math.random() < 1.0 / 8.0) {
                return 2.0;
            }
            return 1.0;
        }
    }
    public static final class Bulldoze extends PhysicalMove {
        public Bulldoze() {
            super(Type.GROUND, 60, 100);
        }
        @Override 
        protected void applyOppEffects(Pokemon def) {
            def.setMod(Stat.SPEED, -1);
        }
    }
    public static final class PsychoCut extends PhysicalMove {
        public PsychoCut() {
            super(Type.PSYCHIC, 70, 100);
        }
        @Override
        protected double calcCriticalHit(Pokemon att, Pokemon def) {
            if (Math.random() < 1.0 / 8.0) {
                return 2.0;
            }
            return 1.0;
        }
    }
    public static class BivalvePokemon extends Pokemon {
        public BivalvePokemon(String name, int level) {
        super(name, level);
        setStats(35, 64, 85, 74, 55, 32);
        setType(Type.WATER);
        addMove(new Waterfall());
        addMove(new WaterPulse());
        addMove(new Rest());
        }
    }
    public static final class Waterfall extends PhysicalMove {
        public Waterfall() {
            super(Type.WATER, 80, 100);
        }
        @Override
        protected void applyOppEffects(Pokemon def) {
            if (Math.random() < 0.2) {
                Effect.flinch(def);
            }
        }
    }
    public static final class WaterPulse extends SpecialMove {
        public WaterPulse() {
            super(Type.WATER, 60, 100);
        }
        @Override 
        protected void applyOppEffects(Pokemon def) {
        if (Math.random() < 0.2) {
            Effect.confuse(def);
            }
        }
    }
    public static final class Rest extends StatusMove {
        public Rest() {
            super(Type.PSYCHIC, 0, 0);
        }
        @Override 
        protected boolean checkAccuracy(Pokemon att, Pokemon def) {
            return true;
        }
        @Override 
        protected void applySelfEffects(Pokemon att) {
            int missingHP = (int) Math.round(att.getStat(Stat.HP) - att.getHP());
            att.setMod(Stat.HP, -missingHP);
            Effect e = new Effect().turns(2).condition(Status.SLEEP).attack(0.0);
            att.setCondition(e);
        }
    }
    public static final class Crunch extends PhysicalMove {
        public Crunch() {
            super(Type.DARK, 80, 100);
        }
        @Override
        protected void applyOppEffects(Pokemon def) {
            if (Math.random() < 0.2) {
                def.setMod(Stat.DEFENSE, -1);
            }
        }
    }
    public static final class DeepSeaPokemon extends BivalvePokemon {
        public DeepSeaPokemon(String name, int level) {
            super(name, level);
            setStats(55, 104, 105, 94, 75, 52);
            setType(Type.WATER);
            addMove(new Crunch());
        }
    }
    public static class SingleBloomPokemonFlabebe extends Pokemon {
        public SingleBloomPokemonFlabebe(String name, int level) {
            super(name, level);
            setStats(44, 38, 39, 61, 79, 42);
            setType(Type.FAIRY);
            addMove(new Psychic());
            addMove(new Moonblast());
        }
    }
    public static final class Psychic extends SpecialMove {
        public Psychic() {
            super(Type.PSYCHIC, 90, 100);
        }
        @Override 
        protected void applyOppEffects(Pokemon def) {
            if (Math.random() < 0.1) {
                def.setMod(Stat.SPECIAL_DEFENSE, -1);
            }
        }
    }
    public static final class Moonblast extends SpecialMove {
        public Moonblast() {
            super(Type.FAIRY, 95, 100);
        }
        @Override 
        protected void applyOppEffects(Pokemon def) {
            if (Math.random() < 0.3) {
                def.setMod(Stat.SPECIAL_ATTACK, -1);
            }
        }
    }
    public static class SingleBloomPokemonFloette extends SingleBloomPokemonFlabebe {
        public SingleBloomPokemonFloette(String name, int level) {
            super(name, level);
            setStats(54, 45, 47, 75, 98, 52);
            setType(Type.FAIRY);
            addMove(new RazorLeaf());
        }
    }
    public static final class RazorLeaf extends PhysicalMove {
        public RazorLeaf() {
            super(Type.GRASS, 55, 95);
        }
        @Override 
        protected double calcCriticalHit(Pokemon att, Pokemon def) {
            if (Math.random() < 1.0 / 8.0) {
                return 2.0;
            }
            return 1.0;
        }
    }
    public static final class GardenPokemon extends SingleBloomPokemonFloette {
        public GardenPokemon(String name, int level) {
            super(name, level);
            setStats(78, 65, 68, 112, 154, 75);
            setType(Type.FAIRY);
            addMove(new DisarmingVoice());
        }
    }
    public static final class DisarmingVoice extends SpecialMove {
        public DisarmingVoice() {
            super(Type.FAIRY, 40, 5.0 / 0.0);
        }
    }
}