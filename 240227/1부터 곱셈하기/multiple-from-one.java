import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for(int i = 1; i<=10; i++){
            if(sum < n){
                 sum *= i;
            }else if(sum>=n){
                System.out.print(i-1);
                break;
            }
           
            
        }
    }
}