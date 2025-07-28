package Chapter9;

public class Wizard {
    String name;
    int hp;
    public void heel(Hero h) {
        h.hp += 10;
        System.out.println(h.name + "のHPを１０回復した！");
    }
}
