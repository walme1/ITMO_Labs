package Moves;
import ru.ifmo.se.pokemon.*;

public final class DisarmingVoice extends SpecialMove {
        public DisarmingVoice() {
            super(Type.FAIRY, 40, 5.0 / 0.0);
        }
        @Override 
        protected double calcTypeEffect(Pokemon att, Pokemon def) {
            if (def.hasType(Type.DRAGON) || def.hasType(Type.DARK)) {
                return super.calcTypeEffect(att, def) * 2.0;
            }
            return super.calcTypeEffect(att, def);
        }
    }