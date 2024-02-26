import java.util.Scanner;
     public class Main {
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        double ave_count = 0.0;
        double ave = 0;
        for(int i = a; i<=b; i++){
            if(i%5==0 || i%7==0){
                sum = sum+i;
                ave_count++;

            }
        }
        if(ave_count!=0){ave = sum/ave_count;}
        System.out.print(sum+" ");
        System.out.println(Math.round(ave*10)/10.0);
        
      
    }
}