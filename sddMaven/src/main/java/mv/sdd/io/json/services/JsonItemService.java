package mv.sdd.io.json.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import mv.sdd.vente.Item;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class JsonItemService {

    // lire une liste de items à partir d'un fichier json
    public List<Item> lireListItems(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new FileInputStream(path), new TypeReference<List<Item>>() {});
    }


    // lire un item à partir d'un fichier json
    public Item lireItem(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new FileInputStream(path), Item.class);
    }

    // écrire une liste de items dans un fichier json
    public void ecrireListItems(String path, List<Item> items) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new FileOutputStream(path), items);
    }

    // écrire un item dans un fichier json
    public void ecrireItem(String path, Item item) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new FileOutputStream(path), item);
    }
}
