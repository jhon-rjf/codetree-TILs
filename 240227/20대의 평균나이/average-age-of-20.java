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
            if(age>=30){
                avg = sum/count;
                double output = (Math.round(avg*1000)/1000.0);
                System.out.println(String.format("%.2f", output));
                break;
            }
            sum += age;
            count++;
           
        }
    }
}