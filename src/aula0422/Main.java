package aula0422;

public class Main {
    public static void main(String[] args) {

        Empregado [] empregado = new Empregado [4];

        empregado [0] = new EmpregadoComissionado(1,"Arthur", 150000, 8);
        empregado [1] = new EmpregadoHorista(2, "Erick", 160, 250);
        empregado [2] = new EmpregadoComissionado(3, "mohamed", 200000, 7);
        empregado [3] = new EmpregadoHorista(4, "Matheus", 120, 210);

        //For Tradicional
        //for (int i = 0; i < empregado.length; i++) {

        //    System.out.println(empregado[i].matricula);
        //    System.out.println(empregado[i].nome);
        //    System.out.println();
        //}

        for (Empregado e : empregado) {
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
            System.out.println();
        }


    }
}
