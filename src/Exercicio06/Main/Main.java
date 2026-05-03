package Exercicio06.Main;

import Exercicio06.Conta.Conta;
import Exercicio06.ContaCorrente.ContaCorrente;
import Exercicio06.ContaPoupanca.ContaPoupanca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<>();
        lista.add(new ContaCorrente("1",5000, 25000));
        lista.add(new ContaPoupanca("2",5000,10));

        for (Conta conta : lista) {
            conta.depositar(2000);
            System.out.println(conta);
            System.out.println(conta.getSaldoDisponivel());
            System.out.println();
        }

        //aplicar rendimento na conta poupança

        for (Conta conta : lista)  {
            if (conta instanceof ContaPoupanca) {
                ((ContaPoupanca) conta).aplicarRendimento();
            }
        }

        //impressão de todos os dados após aplicar o rendimento

        for (Conta conta : lista) {
            System.out.println(conta);
            System.out.println();
        }

    }
}
