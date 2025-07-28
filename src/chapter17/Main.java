package chapter17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        //例外処理
        /*
    　   try {
    　        //実行時にエラーが起こりそうな処理
    　   } chach( 発生するエラーの内容 ) {
    　        //エラー発生時の中断処理
    　   }
        */

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Random random = new Random();

        String[] player = {"rock","scissors","paper"};
        String[] enemy = {"rock","scissors","paper"};
        String player_hand = ""; //playerの手
        String enemy_hand = "";  //cpuの手

        System.out.print("Please choose your hand.(rock : 0 , scissors : 1 , paper : 2) : ");

        int player_input = Integer.parseInt(br.readLine()); //キーボードから 1～3を入力
        player_hand = player[player_input]; //対応した手を取り出す
        System.out.println("Your hand is " + player_hand);
        int enemy_input = random.nextInt(0,2);  //cupが出す手をランダムに選ぶ
        enemy_hand = enemy[enemy_input];
        System.out.println("cpu hand is " + enemy_hand);

        if (player_hand.equals("rock")){
            switch (enemy_hand){
                case "rock":
                    System.out.println("drow");
                    break;
                case "scissors":
                    System.out.println("you win");
                    break;
                case "paper":
                    System.out.println("you lose");
                    break;
            }
        }else if (player_hand.equals("scissors")) {
            switch (enemy_hand){
                case "rock":
                    System.out.println("you lose");
                    break;
                case "scissors":
                    System.out.println("drow");
                    break;
                case "paper":
                    System.out.println("you win");
                    break;
            }
        }else if (player_hand.equals("paper")) {
            switch (enemy_hand){
                case "rock":
                    System.out.println("you win");
                    break;
                case "scissors":
                    System.out.println("you win");
                    break;
                case "paper":
                    System.out.println("drow");
                    break;
            }
        }
    }
}
