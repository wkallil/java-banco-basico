package entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clienteList;

    public Banco() {
        this.clienteList = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clienteList.add(cliente);
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

}
