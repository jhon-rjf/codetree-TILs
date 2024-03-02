import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int nam[] = new int[10];
        int namcount[]= new int[10];
        for (int i = 0; i<10; i++){
            namcount[i] = 0;
        }
        int count= 0;

        for(; a>0; count++){
            nam[count]= a%b;
            a = a/b;
            namcount[nam[count]]++;   
        }
        int sum = 0;
        for(int i = 0; i<10; i++){
            sum = sum + namcount[i] * namcount[i];
            

        }
        System.out.println(sum);
    }
}