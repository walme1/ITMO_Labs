package Moves;
import ru.ifmo.se.pokemon.*;

public final class Crunch extends PhysicalMove {
        public Crunch() {
            super(Type.DARK, 80, 100);
        }
        @Override
        protected void applyOppEffects(Pokemon def) {
            if (Math.random() < 0.2) {
                def.setMod(Stat.DEFENSE, -1);
            }
        }
        @Override 
        protected double calcTypeEffect(Pokemon att, Pokemon def) {
            if (def.hasType(Type.FAIRY)) {
                return super.calcTypeEffect(att, def) * 0.5;
            }
            return super.calcTypeEffect(att, def);
        }
    }