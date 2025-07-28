package Saisyukadai;

public class Goblin extends Monster{
    public Goblin(String name, int hp, char suffix) {
        super("ゴブリン",hp,suffix);
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + this.getSuffix() +"はナイフで切りつけた！" + target.getName() + "に8のダメージ！" );
        target.setHp(target.getHp() - 8);
    }
}
