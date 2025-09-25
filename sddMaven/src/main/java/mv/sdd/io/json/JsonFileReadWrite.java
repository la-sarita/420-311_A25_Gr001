package mv.sdd.io.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import mv.sdd.vente.Client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonFileReadWrite {
    public static void main(String[] args) {
        String pathObj = "data/client.json";
        String pathArray = "data/clients.json";
        Client client = new Client(12345, "Dupont", "Alice", 2500.75);
        Client[] clients = new Client[] {
                new Client(200, "Alain", "Alain", 96500.00),
                new Client(300, "Giles", "Giles", 8700.00),
                new Client(100, "Alex", "Alex", 500.00),
        };

        try {
            // Écrire object java dans un fichier Json
            System.out.println(writeObjectJsonFile(client, pathObj));
            // Lire object java à partir d'un fichier Json
            System.out.println(ReadObjectFromJsonFile(pathObj));
            // Écrire list ou collection java dans un fichier Json
            System.out.println(writeListObjectToJsonFile(clients, pathArray));
            // Lire list ou collection java à partir d'un fichier Json
            System.out.println(ReadListFromJsonFile(pathArray));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static boolean writeObjectJsonFile(Client client, String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // créer un fichier json avec un objet client
        mapper.writeValue(new FileOutputStream(path), client);
//        Client clientLus = mapper.readValue(new FileInputStream(path), Client.class);

        return new File(path).exists();
    }

    public static boolean writeListObjectToJsonFile(Client[] clients, String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter();

        List<Client> listeClients = Arrays.asList(clients);

        // créer un fichier json avec liste de clients
        mapper.writeValue(new FileOutputStream(path), listeClients);

//        List<Client> clientsLus = mapper.readValue(new FileInputStream(path),
//                                                    new TypeReference<List<Client>>() {});

        return new File(path).exists();
    }

    private static Client ReadObjectFromJsonFile(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(new FileInputStream(path), Client.class);
    }

    private static List<Client> ReadListFromJsonFile(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(new FileInputStream(path), new TypeReference<List<Client>>() {
        });
    }
}
