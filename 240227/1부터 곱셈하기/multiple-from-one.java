import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int count = 1;
        for(; count<=10; count++){
            if(sum>=n){
                break;
            }
            sum *= count;

           
            
        }
        System.out.print(count-1);
    }
}