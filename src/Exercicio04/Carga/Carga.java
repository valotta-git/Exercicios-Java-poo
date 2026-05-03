package Exercicio04.Carga;

import Exercicio04.Cliente.Cliente;

import java.util.Random;

public class Carga {

    private int id;
    private String destino;
    private double peso;
    private Cliente cliente;

    public Carga(String destino, Cliente cliente) {
        Random random = new Random();
        this.destino = destino;
        this.cliente = cliente;
        this.id = random.nextInt(1000,9999);
        this.peso = random.nextDouble(100,9999);
    }

    public String getDados() {
        String aux = "";
        aux += "ID: " + id + "\n";
        aux += "Destino: " + destino + "\n";
        aux += "Peso: " + String.format("%.2f",peso) + "\n";
        return aux;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

}
