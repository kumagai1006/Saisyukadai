package chapter12;

public class Hostelry {
    public void heeling(Character[] chara){
        for(int i=0; i<chara.length; i++){
            chara[1].hp += 100;
            System.out.println(chara[1].name + "は宿屋でHPを回復させた！");
        }
        for(Character c : chara){
            c.hp += 100;
            System.out.println(c.name + "は宿屋でHPを回復させた！");
        }

    }
}
