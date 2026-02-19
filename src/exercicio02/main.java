package exercicio02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();
        DecimalFormat df = new DecimalFormat("#,##0.00");

        int freqMax;
        double[] alvo;

        System.out.println("Qual o nome do paciente? ");
        paciente.nome = sc.next();

        System.out.println("Qual a idade do paciente? ");
        paciente.idade = sc.nextInt();

        freqMax = paciente.freqMax();
        alvo = paciente.freqAlvo();

        System.out.println("Frequência máxima: "+ freqMax);
        System.out.println("Alvo inicial: "+ df.format(alvo[0]));
        System.out.println("Alvo final: "+ df.format(alvo[1]));
    }
}
