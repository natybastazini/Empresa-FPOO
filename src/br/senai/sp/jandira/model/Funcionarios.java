package br.senai.sp.jandira.model;

abstract class Funcionarios {

    private String nome;
    private int id;
    private double salarioBase;

    public Funcionarios(String nome, int id, double salarioBase){

        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
    }

   public abstract double CalcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
