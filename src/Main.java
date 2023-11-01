import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String busca;
        ConsultaCepApi consulta = new ConsultaCepApi();

        System.out.println("Digite um CEP (apenas numeros):");
        busca = entrada.next();

        Endereco enderecoNovo = consulta.buscaEndereco(busca);
        System.out.println(enderecoNovo);
    }
}