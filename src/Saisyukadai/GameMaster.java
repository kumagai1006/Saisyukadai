package Saisyukadai;

import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        Hero h = new Hero("勇者", 100, "剣");
        Wizard w = new Wizard("魔法使い", 60, 30);
        Thief t = new Thief("盗賊", 70);
        ArrayList<Character> party = new ArrayList<>();
        party.add(h);
        party.add(1, w);
        party.add(2, t);

        Goblin g = new Goblin("ゴブリン",50,'A');
        Matango m = new Matango("マタンゴ",45,'A');
        Slime s = new Slime("スライム",40,'A');
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(g);
        monsters.add(1,m);
        monsters.add(2,s);
        System.out.println("---味方パーティ---");
        for(Character c : party){
            c.showStatus();
        }
        System.out.println("---敵グループ---");
        for(Monster mo : monsters){
            mo.showStatus();
        }
        System.out.println("\n" + "味方の総攻撃!");
        for(Character c : party){
            for(Monster mo : monsters){
                c.attack(mo);
            }
        }
        System.out.println("\n" + "敵の総攻撃!");
        for(Monster mo : monsters){
            for(Character c : party){
                mo.attack(c);
            }
        }
        SuperHero su = new SuperHero(h);
        System.out.println("\n" + "ダメージを受けた勇者が突然光りだした！");
        System.out.println("勇者はスーパーヒーローに進化した！");
        party.set(party.indexOf(h),su);
        for(Monster mo : monsters){
            su.attack(mo);
        }

        System.out.println("---味方パーティ最終ステータス---");
        for(Character c : party){
            c.showStatus();
            if (c.isAlive()){
                System.out.println("生存状態: 生存");
            } else {
                System.out.println("生存状態:討伐済み");
            }
        }

        System.out.println("---敵グループ最終ステータス---");
        for(Monster mo : monsters){
            mo.showStatus();
            if (mo.isAlive()){
                System.out.println("生存状態: 生存");
            } else {
                System.out.println("生存状態:討伐済み");
            }
        }
    }
}
