package Moves;
import ru.ifmo.se.pokemon.*;

public final class Moonblast extends SpecialMove {
        public Moonblast() {
            super(Type.FAIRY, 95, 100);
        }
        @Override 
        protected void applyOppEffects(Pokemon def) {
            if (Math.random() < 0.3) {
                def.setMod(Stat.SPECIAL_ATTACK, -1);
            }
        }
        @Override 
        protected double calcTypeEffect(Pokemon att, Pokemon def) {
            if (def.hasType(Type.STEEL)) {
                return super.calcTypeEffect(att, def) * 0.5;
            }
            return super.calcTypeEffect(att, def);
        }
    }