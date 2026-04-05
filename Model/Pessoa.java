package SistemaBancario.Model;

public class Pessoa {

    private String nome;
    private int idade;
    private int CPF;
    private int DataNascimento;

    public Pessoa(String nome, int idade, int CPF, int DataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.DataNascimento = DataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public int getCPF() {
        return CPF;
    }

    public int getDataNascimento() {
        return DataNascimento;
    }
}