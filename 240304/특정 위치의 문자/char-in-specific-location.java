import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char[] word = new char[]{ 'L','E', 'B', 'R', 'O', 'S' };
        Scanner sc = new Scanner(System.in);
        // 해당 문자를 찾지 못했다면 -1
        int idx = -1;
        char findWord = sc.next().charAt(0);
        // 문자 탐색
        for (int i = 0; i < 6; i++) {
            if (word[i] == findWord) {
                idx = i;
            }
        }
        if (idx == -1) {
            System.out.println("None");
        }
        else {
            System.out.println(idx);
        }

    }
}