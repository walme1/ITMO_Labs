package Moves;
import ru.ifmo.se.pokemon.*;

public final class Bulldoze extends PhysicalMove {
        public Bulldoze() {
            super(Type.GROUND, 60, 100);
        }
        @Override 
        protected void applyOppEffects(Pokemon def) {
            def.setMod(Stat.SPEED, -1);
        }
        @Override 
        protected double calcTypeEffect(Pokemon att, Pokemon def) {
            if (def.hasType(Type.STEEL)) {
                return super.calcTypeEffect(att, def) * 2.0;
            }
            return super.calcTypeEffect(att, def);
        }
    }