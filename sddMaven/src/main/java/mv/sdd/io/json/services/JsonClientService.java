package mv.sdd.io.json.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import mv.sdd.vente.Client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class JsonClientService {

    // lire une liste de clients à partir d'un fichier json
    public List<Client> lireListClients(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new FileInputStream(path), new TypeReference<List<Client>>() {});
    }


    // lire un client à partir d'un fichier json
    public Client lireClient(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new FileInputStream(path), Client.class);
    }

    // écrire une liste de clients dans un fichier json
    public void ecrireListClients(String path, List<Client> clients) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new FileOutputStream(path), clients);
    }

    // écrire un client dans un fichier json
    public void ecrireClient(String path, Client client) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new FileOutputStream(path), client);
    }
}
