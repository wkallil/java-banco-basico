package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String cpf;
    private String nome;
    private List<Conta> contaList;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.contaList = new ArrayList<>();
    }

    public void adicionarContas(Conta contas) {
        contas.setCliente(this);
        this.contaList.add(contas);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContaList() {
        return contaList;
    }

    @Override
    public String toString() {
        return nome;
    }
}
