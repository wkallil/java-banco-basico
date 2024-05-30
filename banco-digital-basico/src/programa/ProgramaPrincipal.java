package programa;

import entidades.*;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        // Criando conta
        Conta contaCorrente1 = new ContaCorrente();
        Conta contaPoupanca1 = new ContaPoupanca();

        // Ligando cliente a conta
        Cliente cliente1 = new Cliente("111.111.111-11", "João Cleber");
        cliente1.adicionarContas(contaCorrente1);
        cliente1.adicionarContas(contaPoupanca1);

        // Criando conta
        Conta contaCorrente2 = new ContaCorrente();
        Conta contaPoupanca2 = new ContaPoupanca();

        // Ligando cliente a conta
        Cliente cliente2 = new Cliente("222.222.222-22", "Luiza Marinho");
        cliente2.adicionarContas(contaPoupanca2);
        cliente2.adicionarContas(contaCorrente2);

        // Adicionando Cliente ao banco
        Banco bancoDigital = new Banco();
        bancoDigital.adicionarCliente(cliente1);
        bancoDigital.adicionarCliente(cliente2);

        // Depositos na conta
        contaCorrente1.depositar(500.50);
        contaPoupanca1.depositar(100.00);
        contaCorrente2.depositar(120.00);
        contaPoupanca2.depositar(300.00);

        // Saques
        contaCorrente1.sacar(50.50);
        contaPoupanca1.sacar(20.00);
        contaCorrente2.sacar(20.00);
        contaPoupanca2.sacar(150.00);

        // Transferências
        contaCorrente1.transferir(50.0, contaCorrente2);
        contaPoupanca1.transferir(30.0, contaPoupanca2);

        // Extratos
        contaCorrente1.imprimirExtrato();
        System.out.println();
        contaPoupanca1.imprimirExtrato();
        System.out.println();
        contaCorrente2.imprimirExtrato();
        System.out.println();
        contaPoupanca2.imprimirExtrato();

        // Clientes do banco
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();
        System.out.println("Todos os clientes do banco: " + bancoDigital.getClienteList());
    }
}
