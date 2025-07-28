package chapter13;


public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("ミナト");
        //エラー (Heroの name , hp がprivateなためアクセスできない)
//        System.out.println("名前："+hero.name+"、HP："+hero.hp);
        System.out.println("名前："+hero.getName()+"、HP："+hero.getHp());

        King king = new King();
        king.talk(hero);

        Hostelry hostelry = new Hostelry();
        hostelry.checkIn(hero);
    }
}
