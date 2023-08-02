import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Endereco {
    private String rua;
    private int numero;

    public Endereco() {
    }

    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    static List<Endereco> cadastrarEnderecos(Scanner scan) {
        List<Endereco> enderecos = new ArrayList<>();
        int cont = 1;

        while (true) {
            System.out.println("");
            System.out.println("Endereço " + cont + " : (Digite 0 para sair)");

            System.out.println("Digite o nome da rua: ");
            scan.nextLine();
            String rua = scan.nextLine();

            if (rua.equals("0")) {
                break;
            }
            System.out.println("");
            System.out.println("Digite o numero da residência: ");
            int numero = scan.nextInt();
            enderecos.add(new Endereco(rua, numero));
            cont++;
        }

        return enderecos;
    }
}
