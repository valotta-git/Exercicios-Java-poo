package Exercicio01_ParkEasy.ParkEasy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Veiculo[] veiculos = new Veiculo[10];
    static Controle[] controles = new Controle[20];
    static int indexVeiculo;
    static int indexControle;

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("""
                    #### Estacionamento ParkEasy ####
                    [1] Entrada de veículo
                    [2] Saída de veículo
                    [3] Imprimir veículos estacionados
                    [4] Imprimir a receita
                    [5] Finalizar
                    """);
            opcao = sc.nextInt();

            switch (opcao) {

                case 1 -> registrarEntrada ();
                case 2 -> registrarSaida ();
                case 3 -> veiculosEstacionados ();
                case 4 -> ReceitaTotal ();

            }
        } while (opcao != 5);
    }

    private static void ReceitaTotal() {

        double valorTotal = 0;

        for (int i = 0; i < indexControle; i++) {
            if (controles[i].horaSaida != null) {
                valorTotal += controles[i].calcularEstadia();
            }
        }
        System.out.println("Receita total: R$ " + valorTotal);
    }

    private static Controle pesquisarControle() {

        String placa;

        System.out.println("Placa para pesquisa: ");
        placa = sc.next().toUpperCase();

        for (int i = 0; i < indexControle; i ++) {
            if (controles[i].veiculo.placa.equals((placa))) {
                return controles[i];
            }
        }

        System.out.println("Veiculo não encontrado!");
        return null;

    }

    private static void registrarSaida() {

        DecimalFormat df = new DecimalFormat("#,##0.00");

        double valorTotal = 0;
        double valor;
        String horaSaida;
        Controle controle = pesquisarControle();
        if (controle != null) {

            System.out.println("Qual o horario de saída do veículo? ");
            horaSaida = sc.next();
            controle.horaSaida = horaSaida;
            valor = controle.calcularEstadia();
            valorTotal += controle.calcularEstadia();
            System.out.println("Valor da estadia R$ " + df.format(valor));

        }
    }

    private static void veiculosEstacionados() {


        for (int i = 0; i < indexControle; i++) {

            if (controles[i].horaSaida == null) {
                System.out.println(controles[i].veiculo.placa);
            }
        }
    }

    public static void registrarEntrada() {

        String marca, modelo, placa;
        String nome;
        long cpf;
        String horaEntrada;

        System.out.println("Placa: ");
        placa = sc.next().toUpperCase();

        Veiculo veiculo = pesquisar(placa);

        if (veiculo == null) {

            System.out.println("Modelo: ");
            modelo = sc.next();
            System.out.println("Marca: ");
            marca = sc.next();
            System.out.println("Propietario: ");
            nome = sc.next();
            System.out.println("CPF: ");
            cpf = sc.nextLong();

            Propietario propietario = new Propietario (nome, cpf);
            veiculo  = new Veiculo (marca, modelo, placa, propietario);
            veiculos[indexVeiculo] = veiculo;
            indexVeiculo ++;
        }

        System.out.println("Hora de entrada (hh:mm): ");
        horaEntrada = sc.next();
        controles[indexControle] = new Controle (veiculo, horaEntrada);
        indexControle ++;
    }

    public static Veiculo pesquisar (String placa) {

        for (int i = 0; i < indexVeiculo; i ++) {
            if (veiculos[i].placa.equals(placa)) {
                return veiculos[i];
            }
        }

        System.out.println("Veiculo não encontrado!");
        return null;
    }
}