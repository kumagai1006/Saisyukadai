package fukusyu;

import java.io.IOException;

public class Fukusyu8 {
    public static void main(String[] args) throws IOException {
        int  [] num  = {3,5,7,2,8,6};
        int max =num[0];
        int min =num[0];
        for(int i = 0 ; i < num.length ; i++){
            if (num[i] > max){
                max = num[i];
            };
            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.println("最大値" + max + "最小値" + min);
    }
}
