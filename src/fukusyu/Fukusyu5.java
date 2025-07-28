import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu5 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("年齢を入力");
            int age = Integer.parseInt(br.readLine());
            if (0 < age && age <= 12) {
                System.out.println("子ども");
            }
            else if (13 <= age && age <= 19) {
                System.out.println("ティーンエイジャー");
            }
            else if (20 <= age && age <= 64) {
                System.out.println("大人");
            }
            else if (65 <= age && age <= 100) {
                System.out.println("シニア");
            }
        }
    }
