import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt(); // total students

        for (int a=0;a<=N/A;a++) {
            for (int b=0;b<=N/B;b++) {
                int remain = N - (A*a + B*b);

                if ((remain >= 0) && (remain%C == 0)) {
                    System.out.println(1);
                    return;
                }
            }
        }

        System.out.println(0);
    }
}