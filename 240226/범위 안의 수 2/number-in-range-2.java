import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    double avg = 0;
    double count = 0.0;
    for(int i = 0; i<10; i++){
        int temp = sc.nextInt();
        if(temp<0 || temp>200){
            temp=0;
            count--;
        }
        sum = sum + temp;
        count++;
    }
    avg = sum/count;
    System.out.print(sum+" ");
    System.out.print(Math.round(avg*10)/10.0);

    }
}