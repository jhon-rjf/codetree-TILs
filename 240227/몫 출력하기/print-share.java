import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // 여기에 코드를 작성해주세요.
       int count = 0;
        while(true){
            int num = sc.nextInt();
            if(num%2==0){
                System.out.println(num/2);
                count ++;
            }else if(num%2!=0){
                continue;
            }
            if(count >=3){
                break;
            }
        }
    }
}