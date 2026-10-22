package Moves;
import ru.ifmo.se.pokemon.*;

public final class Psychic extends SpecialMove {
        public Psychic() {
            super(Type.PSYCHIC, 90, 100);
        }
        @Override 
        protected void applyOppEffects(Pokemon def) {
            if (Math.random() < 0.1) {
                def.setMod(Stat.SPECIAL_DEFENSE, -1);
            }
        }
        protected double calcTypeEffect(Pokemon att, Pokemon def, double multiplier) {
        if (def.hasType(Type.POISON)) {
            return super.calcTypeEffect(att, def) * multiplier;
        } else if (def.hasType(Type.PSYCHIC) || def.hasType(Type.STEEL)) {
            return super.calcTypeEffect(att, def) * 0.5;
        }
        return super.calcTypeEffect(att, def);
    }
}