package SistemaBancario.Model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Usuario titular) {
        super(numero, titular);
    }

    @Override
    public void sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}