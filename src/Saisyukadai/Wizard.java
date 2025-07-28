package Saisyukadai;

public class Wizard extends Character {
    int mp;
    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = 30;
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + "は火の玉を放って" +target.getName() + "に３のダメージ！");
        target.setHp(target.getHp() - 3);
        this.mp -= 1;
    }
}
