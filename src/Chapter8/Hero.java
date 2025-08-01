package Chapter8;

public class Hero {
    String name;
    int hp;
    final int LEVEL = 10;

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した。");
    }
    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("５のダメージ！" );
    }
    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAME OVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}
