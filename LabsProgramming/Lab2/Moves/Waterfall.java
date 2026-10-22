package Moves;
import ru.ifmo.se.pokemon.*;

public final class Waterfall extends PhysicalMove {
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
