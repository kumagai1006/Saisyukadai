package chapter12;

public class Wizard extends Character {
    int mp;

    public void attack() {
        System.out.println("50ダメージ");
    }

    public void fireball(Matango m) {
        System.out.println(this.name + "は火の玉を放った！");
        System.out.println("敵に20ポイントのダメージ");
        m.hp -= 20;
        this.mp -= 5;
    }
}
