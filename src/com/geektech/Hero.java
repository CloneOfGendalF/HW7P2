package com.geektech;

public abstract class Hero implements HavingSuperAbility {
        private int hp;
        private int dmg;
        private String spt;
        public String superAbilityType;

        public int getHp() {
                return hp;
        }

        public void setHp(int hp) {
                this.hp = hp;
        }

        public int getDmg() {
                return dmg;
        }

        public void setDmg(int dmg) {
                this.dmg = dmg;
        }

        public String getSpt() {
                return spt;
        }

        public void setSpt(String spt) {
                this.spt = spt;
        }

        @Override
        public void applySuperAbility(String spt) {

        }
}
