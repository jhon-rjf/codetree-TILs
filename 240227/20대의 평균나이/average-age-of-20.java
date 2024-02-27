import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double sum = 0.00;
        double count = 0.00;
        double avg = 0.00;

        while(true){
            int age = sc.nextInt();
            if(age>=30 || age<20){
                avg = sum/count;
                System.out.println(String.format("%.2f", avg));
                break;
            }
            sum += age;
            count++;
           
        }
    }
}