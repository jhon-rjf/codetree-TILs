import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int yun_year = 0;
        for(int i = 1; i <year; i++){
            if(i%4==0){
                yun_year++;
                if(i%100==0 && i%400!=0){
                    yun_year--;
                }
            }
        }
        System.out.print(yun_year);
    }
    
}