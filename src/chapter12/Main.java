package chapter12;

public class Main {
    public static void main(String[] args) {
        Character c = new SuperHero();

        Character w = new Wizard();
        Matango m = new Matango();
        w.name = "まゆゆ";
        w.attack();
        //w.fireball(m);

        Wizard w2 = new Wizard();
        w2.fireball(m);

        Character[] chara = new Character[3];
        Character h = new Hero();
        h.name = "ぷわみなと";
        Character t = new Thief();
        t.name = "あちな";
        chara[0] = w;
        chara[1] = h;
        chara[2] = t;

        Hostelry host = new Hostelry();
        host.heeling(chara);

        Monster s = new Slime();
        Monster g = new Goblin();
        Hero h2 = new Hero();
        h2.attack(s);
        h2.attack(g);

        Monster[] mons = new Monster[2];
        mons[0] = s;
        mons[1] = g;
        System.out.println("モンスターの動き");
        for(Monster monster : mons) {
            monster.run();
        }
    }
}
