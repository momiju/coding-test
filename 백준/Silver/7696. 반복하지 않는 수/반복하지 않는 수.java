import java.util.*;

public class Main{
    static long[] arr = new long[1000001];
    static boolean[] used = new boolean[10];
    static int count = 0;

    static void number(long num, int current, int target) {
        if(count == 1000000) 
            return;
        
        if(current == target) {
            count++;
            arr[count] = num;
            return;
        }

        for(int i = 0; i <= 9; i++) {
            if (!used[i]) {
                used[i] = true;
                number(num * 10 + i, current + 1, target);
                used[i] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int target = 1; target <= 10; target++) {
            for(int first = 1; first <= 9; first++) {
                if(count == 1000000)
                    break;

                used[first] = true;
                number(first, 1, target);
                used[first] = false;
            }
            if(count == 1000000) 
                break;
        }
        while(true) {
            int n = sc.nextInt();
            if (n == 0) break;
            System.out.println(arr[n]);
        }
    }
}