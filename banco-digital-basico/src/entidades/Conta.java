package entidades;

import java.text.Format;

public abstract class Conta implements InterfaceDeContas {
    protected int agencia;
    protected double saldo;
    private Cliente cliente;

    public Conta() {
        this.agencia = 1;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor depositado deve ser positivo");
        }
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfos() {

        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
