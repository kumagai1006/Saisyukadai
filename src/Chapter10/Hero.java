package Chapter10;

public class Hero {

    public Hero() {
        System.out.println("Heroのコンストラクタが動作");
    }

    String name = "ぷわみなと";
    int hp = 100;

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージをあたえた！");
    }
    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }

}
