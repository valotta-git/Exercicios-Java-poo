package Exercicio00_revisao;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Informe o valor de n --> ");
        n = sc.nextInt();

        while(true) {
            System.out.print(n + " ");
            if(n == 1) break;
            if(n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = 3 * n + 1;
            }
        }
    }
}