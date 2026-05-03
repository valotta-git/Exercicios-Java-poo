package Exercicio02.ParkEasy;

public class Veiculo {

    String marca;
    String modelo;
    String placa;
    Propietario propietario;

    public Veiculo (String marca, String modelo, String placa, Propietario propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.propietario = propietario;
    }
}
