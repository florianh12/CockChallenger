package worksheet5.weapons;

import worksheet5.WeaponEffects;
import worksheet5.attack.SlicingWeapon;

public class Sword extends Weapon implements SlicingWeapon {
    public Sword(int DMG, double hitrate, WeaponEffects weaponEffect, double effectRate) {
        super(DMG, hitrate, weaponEffect, effectRate);
    }

    @Override
    public void slice() {
        System.out.println("Sword is dealing 15 dmg and adds bleed to the enemy");
    }

    @Override
    public void attack(){
        this.slice();
    }

}
