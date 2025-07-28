package Saisyukadai;

public class Matango extends Monster{
    public Matango(String name, int hp, char suffix) {
        super("おばけきのこ",hp,suffix);
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + this.getSuffix() +"は体当たり攻撃！" + target.getName() + "に6のダメージ！" );
        target.setHp(target.getHp() - 6);
    }
}