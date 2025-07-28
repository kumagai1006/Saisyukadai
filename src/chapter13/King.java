package chapter13;

public class King {
    // ※エラー (hero.nameがprivateのため、アクセスできない)
//    public void talk(Hero hero){
//        System.out.println("王様：ようこそ、勇者 "+hero.name+" よ");
//        System.out.print(hero.name + "： ");
//        hero.greeting();
//        System.out.println("王様：つかれたであろう、宿屋で休むといい");
//        System.out.println(hero.name +" : わかりましたぁ");
//        System.out.println("王様: では、また会おう！");
//        System.out.print(hero.name +" : ");
//        hero.bye();
//        System.out.println();
//    }

    //getterメソッドを使用
    public void talk(Hero hero){
        System.out.println("王様：ようこそ、勇者 "+hero.getName()+" よ");
        System.out.print(hero.getName() + "： ");
        hero.greeting();
        System.out.println("王様：つかれたであろう、宿屋で休むといい");
        System.out.println(hero.getName() +" : わかりましたぁ");
        System.out.println("王様: では、また会おう！");
        System.out.print(hero.getName() +" : ");
        hero.bye();
        System.out.println();
    }

}
