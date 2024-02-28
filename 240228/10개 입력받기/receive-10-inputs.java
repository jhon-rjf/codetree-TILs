import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        
        double count = 0;
        int sum = 0;
        for(int i = 0;  i<10; i++){
            arr[i]=sc.nextInt();   
            sum += arr[i];
            count++;
            if(arr[i]==0){
                sum -= arr[i];
                count --;
                break;
            }   
        }
    
        double avg = sum/count;
        System.out.print(sum+" ");
        System.out.printf("%.1f", avg);
        
    }
}