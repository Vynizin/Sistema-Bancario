package SistemaBancario.Model;

public class Usuario extends Pessoa {

    private String senha;

    public Usuario(String nome, int idade, int CPF, int DataNascimento, String senha) {
       super(nome, idade, CPF, DataNascimento);
       this.senha = senha;
    }

    public boolean autenticar(int cpf, String senha) {
        return this.getCPF() == cpf && this.senha.equals(senha);
    }
}