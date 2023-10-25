package br.senai.sp.jandira.model;

public class Gerente extends Funcionarios{

    private double bonus;

    public Gerente(String nome, int id, double salarioBase) {
        super(nome, id, salarioBase);
    }

    @Override
    public double CalcularSalario() {
        return getSalarioBase() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
