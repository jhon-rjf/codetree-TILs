import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int arr[] = new int[10];
        int count = 0;
        int sum = 0;
        for(int i = 0; i<10; i++){
            int input = sc.nextInt();
            if(input == 0){
                break;
            }else {
                arr[i] = input;
                if(arr[i]%2==0){
                    count ++;
                    sum += arr[i];
                }
            }
        }
        System.out.print(count+" ");
        System.out.print(sum);
    }
}