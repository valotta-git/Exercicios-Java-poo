package Exercicio03;

public class Professor {

    String nome;
    double numAulaSemanal;
    double valHoraAula;

    public double salBase () {

        return numAulaSemanal * 4.5 * valHoraAula;

    }

    public double AdicionalHora () {
        return salBase() * 0.05;
    }

    public double DescansoRemunerado () {
        return (salBase() + AdicionalHora()) / 6;
    }

    public double calcularSal () {
        return salBase() + AdicionalHora() + DescansoRemunerado();
    }

}
