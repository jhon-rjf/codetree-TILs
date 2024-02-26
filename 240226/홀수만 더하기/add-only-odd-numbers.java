import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<count; i++){
            int temp = sc.nextInt();
            if(temp%2==1 && temp%3==0){
                sum = sum + temp;
            }
        }
        System.out.print(sum);
        // 여기에 코드를 작성해주세요.
    }
}