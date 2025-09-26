package mv.sdd.io.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mv.sdd.io.json.services.JsonItemService;
import mv.sdd.io.json.services.JsonService;
import mv.sdd.vente.Client;
import mv.sdd.vente.Item;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilisationJsonService {
    public static void main(String[] args) {
        Client client = new Client(12345, "Dupont", "Alice", 2500.75);
        Client[] clients = new Client[] {
                new Client(200, "Alain", "Alain", 96500.00),
                new Client(300, "Giles", "Giles", 8700.00),
                new Client(100, "Alex", "Alex", 500.00),
        };
        String donnees = "{\"numCompte\":98765,\"nom\":\"Martin\",\"prenom\":\"Bob\",\"solde\":1500.0}";
        Item item = new Item(1, "patate", 2.5f);
        List<Item> items = new ArrayList<>();
        Item item1 = new Item(2, "tomate", 2.95f);
        Item item2 = new Item(3, "jus", 5.5f);
        Item item3 = new Item(4, "lait", 3.75f);
        items.add(item1);
        items.add(item2);
        items.add(item3);

        ObjectMapper mapper = new ObjectMapper();
        try {
//            String clientSer = mapper.writeValueAsString(client);
//            System.out.println(clientSer);
//
//            Client clientDeser = mapper.readValue(donnees, Client.class);
//            System.out.println("Client : " + clientDeser.getNom() + " " + clientDeser.getPrenom() +
//                    ", Compte : " + clientDeser.getNumCompte() +
//                    ", Solde : " + clientDeser.getSolde());
//
//            JsonClientService jsonClientService = new JsonClientService();
//            jsonClientService.ecrireClient("data/clientSer.json", client);
//
//            jsonClientService.ecrireListClients("data/clientsSer.json", Arrays.asList(clients));
//
//            Client clientLu = jsonClientService.lireClient("data/client.json");
//            List<Client> clientsLus = jsonClientService.lireListClients("data/clients.json");
//            System.out.println(clientsLus.size());

            JsonItemService jsonItemService = new JsonItemService();
            jsonItemService.ecrireItem("data/item.json", item);
            jsonItemService.ecrireListItems("data/items.json", items);
            System.out.println(jsonItemService.lireItem("data/item.json"));
            System.out.println(jsonItemService.lireListItems("data/items.json").size());

            JsonService<Item> jsonServiceItem = new JsonService<>();
            jsonServiceItem.ecrireList("data/itemsService.json", items);

            JsonService<Client> jsonServiceClient = new JsonService<>();
            jsonServiceClient.ecrireList("data/clientsService.json", Arrays.asList(clients));
        } catch (JsonProcessingException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());

        }
    }
}
