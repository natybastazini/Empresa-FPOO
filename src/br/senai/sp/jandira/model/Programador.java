package br.senai.sp.jandira.model;

public class Programador extends Funcionarios{

    private int horaExtra;

    public Programador(String nome, int id, double salarioBase) {
        super(nome, id, salarioBase);
    }

    @Override
    public double CalcularSalario() {
        return getSalarioBase() + (horaExtra * 200);
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }
}
