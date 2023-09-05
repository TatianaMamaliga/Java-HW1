package session12.practice.changeRuntimeBehaviour;

public class GameTest {

    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter(new Sword());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Bow());
        gameCharacter.attack();
    }
}
