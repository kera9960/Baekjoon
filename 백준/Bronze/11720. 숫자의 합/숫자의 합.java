import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int sum =0;
        String a = sc.next();
        char b;
        int c;
        for (int i =0; i<N;i++){
            b = a.charAt(i);
            c = b -'0';
            sum += c;
        }
        System.out.println(sum);
    }
}
