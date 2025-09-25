package mv.sdd.io.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mv.sdd.vente.Client;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonConversions {
    public static void main(String[] args) {
        Client client = new Client(12345, "Dupont", "Alice", 2500.75);
        Client[] clients = null;
        String donnees = "{\"numCompte\":98765,\"nom\":\"Martin\",\"prenom\":\"Bob\",\"solde\":1500.0}";
        String jsonArray = "[{\"numCompte\":111,\"nom\":\"Durand\",\"prenom\":\"Paul\",\"solde\":3000.0},"
                + "{\"numCompte\":222,\"nom\":\"Moreau\",\"prenom\":\"Sophie\",\"solde\":4500.5}]";
        String clientsJson = null;

        // 1 - Conversion Objet → JSON
        String jsonObject = convertJavaObjectToJsonObject(client);
        System.out.println("Objet vers JSON : " + jsonObject);
        Client javaObject = null;

        try {
            // 2 - Conversion JSON → Objet
            javaObject = convertJsonObjectToJavaObject(donnees);
            // 3 - Conversion JSON array → Objet array or collection
            clients = convertJsonArrayToObjectArray(jsonArray);
            // 4 - Conversion Objet array or collection → JSON array
            clientsJson = convertListObjectToJsonArray(clients);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(javaObject);
        for (Client c : clients) {
            System.out.println(c.getNumCompte() + " - " + c.getNom() + " " + c.getPrenom() + " : " + c.getSolde());
        }
        System.out.println("Clients : " + clientsJson);
    }


    public static String convertJavaObjectToJsonObject(Client client) {
        ObjectMapper mapper = new ObjectMapper();

        String jsonObject = null;
        try {
            jsonObject = mapper.writeValueAsString(client);
        } catch (JsonProcessingException e) {
            System.err.println(e.getMessage());
        }

        return jsonObject;
    }

    public static Client convertJsonObjectToJavaObject(String donnees)  throws IOException{
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(donnees, Client.class);
    }

    public static Client[] convertJsonArrayToObjectArray(String jsonArray) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Client[] clients  = mapper.readValue(jsonArray, Client[].class);

        return clients;
    }

    public static String convertListObjectToJsonArray(Client[] clients) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter();

        List<Client> listeClients = Arrays.asList(clients);

        // créer un fichier json avec liste de clients
        return mapper.writeValueAsString(listeClients);
    }

}
