package SistemaBancario.Model;

public class Usuario extends Pessoa {
    
    public Usuario(String nome, int idade, int CPF, int DataNascimento) {
       super(nome, idade, CPF, DataNascimento);
    }

    public void dados() {
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getCPF());
        System.out.println(getDataNascimento());
    }
}