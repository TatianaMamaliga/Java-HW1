package session12.practice.changeRuntimeBehaviour;

public class GameCharacter {

    private Weapon weapon;

    GameCharacter(Weapon weapon) {
        this.weapon = weapon;
    }

    void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void attack() {
        weapon.use();
    }
}
