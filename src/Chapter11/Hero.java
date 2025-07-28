package Chapter11;

public class Hero extends Character {

    public Hero() {
        super();
    }
    public void greeting() {
        System.out.println("ちわー");
    }
    public void attack() {
        System.out.println(this.name + "は攻撃した！");
    }
}
