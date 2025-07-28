package Saisyukadai;

public abstract class Monster implements Creature{
    private  String name;
    private int hp;
    private char suffix;

    public Monster(String name, int hp, char suffix) {
        this.name = name;
        this.hp = hp;
        this.suffix = suffix;
    }

    public final boolean isAlive() {
        return hp > 0;
    }

    public final void showStatus() {
        System.out.println(getName() + suffix + ":HP " + getHp());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public char getSuffix() {
        return suffix;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
}