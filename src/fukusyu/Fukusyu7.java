package fukusyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu7 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("数字を入力してください>");
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 1; i <= num; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("1~" + num +"の合計は、" + sum);

    }
}
