package mv.sdd.io.json.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class JsonService<T> {
    // lire une liste de items à partir d'un fichier json
    public List<T> lireList(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new FileInputStream(path), new TypeReference<List<T>>() {});
    }


    // lire un item à partir d'un fichier json
    public T lireUn(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new FileInputStream(path), new TypeReference<T>(){});
    }

    // écrire une liste de items dans un fichier json
    public void ecrireList(String path, List<T> items) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new FileOutputStream(path), items);
    }

    // écrire un item dans un fichier json
    public void ecrireUn(String path, T item) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new FileOutputStream(path), item);
    }
}
