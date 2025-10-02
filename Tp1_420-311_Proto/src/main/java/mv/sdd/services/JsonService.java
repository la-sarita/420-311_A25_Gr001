package mv.sdd.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class JsonService<T> {

    static ObjectMapper mapper = new ObjectMapper();

    public Collection<T> readList(String filePath, Class<T> ref) throws IOException {
        return mapper.readValue(new File(filePath), mapper.getTypeFactory().constructCollectionType(Collection.class, ref));
    }

    public T readObject(String filePath) throws IOException {
        return mapper.readValue(new File(filePath),
                new TypeReference<T>(){});
    }

    public boolean writeObject(String path, T objet) throws IOException {
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), objet);
        return new File(path).exists();
    }

    public boolean writeList(String path, Collection<T> liste) throws IOException {
        // TODO : à implémenter
        return new File(path).exists();
    }
}
