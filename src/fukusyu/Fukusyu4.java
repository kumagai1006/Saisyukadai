import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("数字を入力してください");
        int n= Integer.parseInt(br.readLine());
        if (n > 0) {
            System.out.println("Positive");
        }if(n < 0) {
            System.out.println("Negative");
        }
    }
}
