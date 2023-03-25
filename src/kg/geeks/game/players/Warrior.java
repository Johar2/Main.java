package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }

    @Override
    public void attack(Boss boss) {
        int damage = this.getDamage();
        int randomMultiplier = RPG_Game.random.nextInt(3) + 2; // получаем случайное число от 2 до 4
        damage *= randomMultiplier;
        boss.setHealth(boss.getHealth() - damage);
    }
}
