package Exercicio04.Cliente;

public class Cliente {

    private int cnpj;
    private String cliente;

    public Cliente(int cnpj, String cliente) {
        this.cnpj = cnpj;
        this.cliente = cliente;
    }

    public String getDados() {
        String aux = "";
        aux += "CNPJ: " + cnpj +"\n";
        aux += "Cliente: " + cnpj +"\n";
        return aux;
    }

    public int getCnpj() {
        return cnpj;
    }

}
