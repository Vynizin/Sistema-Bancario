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
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getCPF() {
        return CPF;
    }
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getDataNascimento() {
        return DataNascimento;
    }
    public void setDataN(int DataNascimento) {
        this.DataNascimento = DataNascimento;
    }
}