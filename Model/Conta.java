package SistemaBancario.Model;

public abstract class Conta {
    protected int numero;
    protected float saldo;
    protected Usuario titular;

    public Conta(int numero, Usuario titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public abstract void sacar(float valor);

    public void depositar(float valor) {
        saldo += valor;
    }

    public float getSaldo() {
         return saldo; 
        }
    public int getNumero() {
         return numero; 
        }
    public Usuario getTitular() { 
        return titular; 
    }
}