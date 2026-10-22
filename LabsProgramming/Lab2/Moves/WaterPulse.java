package Moves;
import ru.ifmo.se.pokemon.*;

public final class WaterPulse extends SpecialMove {
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