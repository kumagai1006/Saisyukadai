package Saisyukadai;


public class Hero extends Character {
    private String weapon;

    public Hero(String name, int hp, String weapon){
        super(name, hp);
        this.weapon = weapon;
    }

    public void attack(Creature target){
        System.out.println(this.getName() + "は" +this.weapon+"で攻撃！"+ target.getName()+ "に10のダメージ！");
        target.setHp(target.getHp()-10);
    }

    public String getWeapon(){
        return weapon;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
}