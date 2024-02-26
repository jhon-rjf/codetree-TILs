import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int third_cnt = 0;
        int fifth_cnt = 0;
        //입력받기
        for(int i = 0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        //3의배수
        for(int i = 0; i<10; i++){
            if(arr[i]%3==0){
                third_cnt++;
            }
        }
        for(int i = 0; i<10; i++){
            if(arr[i]%5==0){
                fifth_cnt++;
            }
        }
        System.out.print(third_cnt+" ");
        System.out.print(fifth_cnt);
    }
}