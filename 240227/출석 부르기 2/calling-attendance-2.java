import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        String classroom[] = new String[4];
        classroom[0] ="John";
        classroom[1] ="Tom";
        classroom[2] ="Paul";
        classroom[3] ="Sam";
        while(true){
            int num = sc.nextInt();
            if(num>4){
                System.out.println("Vacancy");
                break;
            }
            System.out.println(classroom[num-1]);
        }
    }
}