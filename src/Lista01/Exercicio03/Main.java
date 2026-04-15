package Lista01.Exercicio03;
import java.text.DecimalFormat;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Professor professor = new Professor();


        System.out.println("Qual o nome do professor? ");
        professor.nome = sc.next();

        System.out.println("Q");


    }
}
