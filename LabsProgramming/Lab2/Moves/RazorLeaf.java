package Moves;
import ru.ifmo.se.pokemon.*;

public final class RazorLeaf extends PhysicalMove {
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
        @Override  
        protected double calcTypeEffect(Pokemon att, Pokemon def) {
            if (def.hasType(Type.WATER)) {
                return super.calcTypeEffect(att, def) * 2.0;
            }
            return super.calcTypeEffect(att, def);
        }
    }