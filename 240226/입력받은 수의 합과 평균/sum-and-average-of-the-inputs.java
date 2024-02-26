import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        double count = 0.0;
        double avg = 0.0;
        for(int i = 0; i<n; i++){
            int temp = sc.nextInt();
            sum = sum + temp;
            count++;
        }
        avg=sum/count;
        System.out.print(sum+" "); 
        System.out.print(Math.round(avg*10)/10.0);
        // 여기에 코드를 작성해주세요.
    }
}