package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Gerente;
import br.senai.sp.jandira.model.Programador;

public class App {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Natália", 1, 100000);
        Programador programador = new Programador("Natália", 1,20000);

        System.out.println("-----------------------------------------");
        System.out.println("O nome do gerente é: " + gerente.getNome());
        System.out.println("O id é: " + gerente.getId());
        System.out.println("O salário é: " + gerente.CalcularSalario());
        System.out.println("-----------------------------------------");
        System.out.println("O nome do programador é: " + programador.getNome());
        System.out.println("O id é: " + programador.getId());
        System.out.println("O salário é: " + programador.CalcularSalario());






    }
}
