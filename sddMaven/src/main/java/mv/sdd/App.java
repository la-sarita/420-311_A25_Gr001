package mv.sdd;

import mv.sdd.vente.Client;
import mv.sdd.vente.NomComparator;
import mv.sdd.vente.SoldeComparator;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        List<Client> clients = new ArrayList<>();

        Client client1 = new Client(200, "Alain", "Alain", 96500.00);
        Client client2 = new Client(300, "Giles", "Giles", 8700.00);
        Client client3 = new Client(100, "Alex", "Alex", 500.00);

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        System.out.println(clients);
        Collections.sort(clients);
        System.out.println(clients);

        Collections.reverse(clients);
        System.out.println(clients);

        System.out.println("=============");
        Collections.sort(clients, new NomComparator());
        System.out.println(clients);

        Collections.sort(clients, new SoldeComparator());
        System.out.println(clients);
        Collections.reverse(clients);
        System.out.println(clients);
    }
}
