package Moves;
import ru.ifmo.se.pokemon.*;

public final class PsychoCut extends PhysicalMove {
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
        protected double caclTypeEffect(Pokemon att, Pokemon def) {
            if (def.hasType(Type.STEEL)) {
                return super.calcTypeEffect(att, def) * 0.5;
            }
            return super.calcTypeEffect(att, def);
        }
    }