import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String busca;
        ConsultaCepApi consulta = new ConsultaCepApi();

        System.out.println("Digite um CEP com 09 digitos (apenas numeros):");
        busca = entrada.next();


        try {
            Endereco enderecoNovo = consulta.buscaEndereco(busca);
            System.out.println(enderecoNovo);

            CriaArquivo novoArquivo = new CriaArquivo();
            novoArquivo.criaArquivoJson(enderecoNovo);


        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }



    }
}