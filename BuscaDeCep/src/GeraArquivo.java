import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeraArquivo {
    public void geraJson(Endereço endereço) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escreve = new FileWriter(endereço.cep() + ".json");
        escreve.write(gson.toJson(endereço));
        escreve.close();
    }
}
