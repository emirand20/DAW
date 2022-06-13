package m03.uf05.colecciones;

import java.util.HashSet;

public class CuantosUsiarios {
    public static void main(String[] args) {
        HashSet<Cliente> clientesBanco = new HashSet<Cliente>();

        Cliente cl1 = new Cliente("Luis", "00001", 2000);
        Cliente cl2= new Cliente("Miguel", "00002", 2500);
        Cliente cl3 = new Cliente("Andres", "00003", 2200);
        Cliente cl4 = new Cliente("Julio", "00004", 22400);
        
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);

        for (Cliente cliente : clientesBanco) {
            System.out.println(cliente.getNombre() + " " 
            + cliente.getN_cuenta() + " " + cliente.getSaldo());
        }

    }
}
