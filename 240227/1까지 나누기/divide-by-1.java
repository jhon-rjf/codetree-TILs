import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int divide = n;
        for(int i = 1; i<=n; i++){
            count++;
             divide = divide/i;
            if(divide>1){
                continue;
            }else if(divide <=1){
                System.out.print(i);
                break;
                
            }
        }
    }
}