package Saisyukadai;

public class SuperHero extends Hero {
    public SuperHero(Hero hero) {
        super(hero.getName(), hero.getHp(), hero.getWeapon());
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + "は" +this.getWeapon() + "で攻撃！" + target.getName() + "に２５のダメージ！");
        target.setHp(target.getHp() - 25);
    }
}