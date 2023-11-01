import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class CriaArquivo {
    public void criaArquivoJson(Endereco endereco) throws IOException {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter listaCep = new FileWriter(endereco.cep() + ".json");
        listaCep.write(gson.toJson(endereco));
        listaCep.close();
    }
}
