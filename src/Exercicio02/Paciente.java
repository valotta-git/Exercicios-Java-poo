package Exercicio02;

public class Paciente {

    String nome;
    int idade;

    public int freqMax () {
        return 220 - idade;
    }

    public double [] freqAlvo () {

        double[] alvo = new double [2];

        int freq = freqMax();
        alvo[0] = freq * 0.5;
        alvo[1] = freq * 0.85;
        return alvo;
    }

}
