package kg.geeks.game.players;

public class Magic extends Hero {
    private int n;

    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
        this.n = n;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                heroes[i].setDamage(heroes[i].getDamage() + n);
            }
        }
    }
}
