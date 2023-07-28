package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa Benio = new Pessoa("Ben 10 ", 10);
        List<Pessoa> pessoas = new ArrayList<>();
        List<Endereco> enderecos= new ArrayList<>();
        Scanner scanf = new Scanner(System.in);
        for(int i=0; i<3;i++){
            System.out.println("Digite o nome e logo em seguida a idade ");
            String nome = scanf.nextLine();
            int idade = scanf.nextInt();
            System.out.println("Digite quantos endereços voce deseja adicionar:");
            int qtEndereco = scanf.nextInt();
            
        }


    }
}