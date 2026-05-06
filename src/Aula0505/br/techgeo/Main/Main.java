package Aula0505.br.techgeo.Main;

import Aula0505.br.techgeo.Forma.Cilindro;
import Aula0505.br.techgeo.Forma.Circulo;
import Aula0505.br.techgeo.Ponto.Ponto;

public class Main {
    public static void main(String[] args) {

        Ponto ponto;

        //Cilindro
        ponto = new Ponto(2, -3);
        Cilindro cilindro = new Cilindro(8,2,ponto);
        System.out.println("área = " + cilindro.calcularArea());
        System.out.println("volume = " + cilindro.calcularVolume());

        //Circulo
        ponto = new Ponto(-4, 7);
        Circulo circulo = new Circulo(10,ponto);
        System.out.println("área = " + circulo.calcularArea());
    }
}
