package chapter13;

public class Hostelry {
    // ※エラー (hero.hpがprivateになっているためアクセスできない)
    public void checkIn(Hero hero){
        System.out.println(hero.name + "は宿屋で休んだ！");
        hero.hp = -100;
        System.out.println(hero.name + "のHPが100かいふくした！");
        System.out.println("名前："+hero.name+"、HP："+hero.hp);
    }

    // ※setterメソッドを使用
//    public void checkIn(Hero hero){
//        System.out.println(hero.getName() + "は宿屋で休んだ！");
//        hero.setHp(100); //※
//        System.out.println(hero.getName() + "のHPが100かいふくした！");
//        System.out.println("名前："+hero.getName()+"、HP："+hero.getHp());
//    }
}
