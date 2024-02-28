import java.util.Scanner;
public class Main {
    public static String calc(int num1, int num2, int num3, int num4){
        double sum = num1 + num2 + num3 + num4;
        double avg = sum/4;
        String result = "";
        if(avg>=60){
            result ="pass";
        }else{
            result ="fail";
        }
        return result;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int numOfStudent = sc.nextInt();
       
        for (int z = 0; z<numOfStudent; z++){ 
            String result = "";
            int arr[] = new int[4];
            for(int i = 0; i<4; i++){
                arr[i] = sc.nextInt();
             }
             result = calc(arr[0], arr[1], arr[2], arr[3]);
             if(result.equals("pass")){
                count ++;
             }
             System.out.println(result);

        }
        System.out.print(count);
       
        

    }
}