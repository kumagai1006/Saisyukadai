package Saisyukadai;

public abstract class Character implements Creature{
    private String name;
    private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public final boolean isAlive() {
        return hp > 0;
    }

    public final void showStatus() {
        System.out.println(getName() + ":HP " + getHp());
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
}
