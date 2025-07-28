package Chapter9;

public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "ふわっちクルーラー";
        s.damage = 10;
        Hero h1 = new Hero();
        h1.name = "ぷわみなと";
        //h1.hp = 100;
        Hero h2 = new Hero();
        h2.name = "あちな";
        //h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "まゆゆ";
        w.hp = 50;

        w.heel(h1);
        w.heel(h2);
        w.heel(h2);

        System.out.println(h1.hp);
        //h1.sword = s;
        //System.out.println("現在の武器は" + h1.sword.name);

    }
}
