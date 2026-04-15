package Exercicio08.br.fiap.Viagem;

import Exercicio08.br.fiap.Carga.Carga;

public class Viagem {

    private double capacidade;
    private int index;
    private Carga [] carga;

    public Viagem () {
        this.capacidade = 10000;
        this.index = 0;
        this.carga = new Carga [20];
    }

    public double capacidadeReservada() {
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += carga[i].getPeso();
        }
        return total;
    }

    public boolean permitidoReservar (double peso) {
        double aux = capacidadeReservada();
        if (index < carga.length && aux + peso <= capacidade) {
            return true;
        }
        return false;
    }

    public boolean reservar (Carga carga) {
        if (permitidoReservar(carga.getPeso())) {
            this.carga[index] = carga;
            index ++;
            return true;
        }
        return false;
    }

    public String getDados() {
        String aux = "";
        for (int i = 0; i < index; i++) {
            aux += carga[i].getDados();
        }
        return aux;
    }
}