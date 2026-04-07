package exercicio00_revisao;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n;
        int total, maiorTotal = 0;

        System.out.print("Informe o valor inicial --> ");
        i = sc.nextInt();
        System.out.print("Informe o valor final --> ");
        j = sc.nextInt();

        while(i <= j) {
            total = 0;
            n = i;
            while(true) {
                total++;
                if(n == 1) break;
                if(n % 2 == 0) {
                    n = n / 2;
                }
                else {
                    n = 3 * n + 1;
                }
            }
            if(total > maiorTotal) {
                maiorTotal = total;
            }
            i++;
        }
        System.out.print("maior total de impressões = " + maiorTotal);
    }
}