import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //양이 하루에 먹는 사료의 양
        int b = sc.nextInt(); //염소가 하루에 먹는 사료의 양
        int n = sc.nextInt(); //양+염소 전체 수
        int w = sc.nextInt(); //전체 사료의 양

        int cnt = 0;
        int sheepC = 0;
        int goatC = 0;

        for(int i=1;i<n;i++){ //i == 양의 수
            int j = n-i; //j == 염소의 수
            if(a*i + b*j == w) {
                cnt++;
                sheepC = i;
                goatC = j;
            }
        }
        if(cnt == 1)
            System.out.print(sheepC + " " + goatC);
        else
            System.out.print(-1);
    }
}