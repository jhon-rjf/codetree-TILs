import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        double divide = n;
        for(double i = 1.0; i<=n; i++){
             divide = divide/i;
            if(divide>1){
                count++;
                continue;
            }else if(divide <=1){
                break;
            }
        }
        System.out.print(count);
    }
}