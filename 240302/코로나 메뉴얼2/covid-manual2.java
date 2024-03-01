import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int countA = 0;
       int countB = 0;
       int countC = 0;
       int countD = 0;
       String cough[] = new String[3];
       int temperature[] = new int[3];

       for(int i = 0; i<3; i++){
        cough[i] = sc.next();
        temperature[i] = sc.nextInt();
        if (temperature[i]>=37 && cough[i].equals("Y")){
            countA++;
        }
        if (temperature[i]>=37 && cough[i].equals("N")){
            countB++;
        }
        if (temperature[i]<37 && cough[i].equals("Y")){
            countC++;
        }
        if (temperature[i]<37 && cough[i].equals("N")){
            countD++;
        }
       }
         System.out.print(countA+" ");
        System.out.print(countB+" ");
        System.out.print(countC+" ");
        System.out.print(countD+" ");
        if(countA>=2){
            System.out.print("E");
        }
    }
}