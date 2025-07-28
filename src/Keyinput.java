import java.io.*; // 標準入出力に関連するクラスを使用するためのパッケージをインポート

public class Keyinput {
    // throws IOException 入出力処理中の例外を通知する宣言
    public static void main(String[] args) throws IOException {
        // キーボード入力から「1文字」を読み込む InputStreamReader を作成
        InputStreamReader isr = new InputStreamReader(System.in); // System.in キーボードからの入力

        // BufferedReader 入力された「1行」をまとめて読み込む
        BufferedReader br = new BufferedReader(isr);


        System.out.print("名前を入力してください>");

        // ユーザーがキーボードで入力し、Enterを押した1行の文字列を読み込む
        String inputName = br.readLine();


        System.out.print("年齢を入力してください>");

        // Integer クラスの parseInt メソッドを使って、br.readLine()文字列をint整数に変換する
        int age = Integer.parseInt(br.readLine());


        System.out.println(age + "歳の" + inputName + "さん。\nこんにちは。");
    }
}