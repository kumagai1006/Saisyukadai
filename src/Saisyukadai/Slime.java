package Saisyukadai;

public class Slime extends Monster{
    public Slime(String name, int hp, char suffix) {
        super("スライム",hp,suffix);
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + this.getSuffix() +"は体当たり攻撃！" + target.getName() + "に5のダメージ！" );
        target.setHp(target.getHp() - 5);
    }
}
