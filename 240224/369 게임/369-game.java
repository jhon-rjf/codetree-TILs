import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            String s = String.valueOf(i);
            if(i%3==0 || s.contains("3")|| s.contains("6") || s.contains("9")){
                System.out.print("0 ");
                continue;
        }
            System.out.print(i+" ");
        }
    }
}