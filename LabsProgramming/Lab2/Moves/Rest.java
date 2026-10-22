package Moves;
import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
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