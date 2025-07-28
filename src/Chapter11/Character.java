package Chapter11;

public abstract class Character implements Creature {
    String name = "ぷわみなと";
    int hp;

    public void run() {
        System.out.println(this.name + " は逃げ出した！");
    }

    public void walk() {
        System.out.println("歩くよ");
    }

    public abstract void attack();
}
