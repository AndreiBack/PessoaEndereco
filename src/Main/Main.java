package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        List<Endereco> enderecos= new ArrayList<>();
        Scanner scanf = new Scanner(System.in);
        for(int i=0; i<2;i++){
            System.out.println("Digite o nome e logo em seguida a idade ");
            String nome = scanf.nextLine();
            int idade = scanf.nextInt();
            System.out.println("Digite quantos endereços voce deseja adicionar:");
            int qtEndereco = scanf.nextInt();
            for (int j=0;j<qtEndereco;j++){
                System.out.println("Digite a rua e logo em seguida o numero ");
                scanf.nextLine();
                String rua = scanf.nextLine();
                int numero = scanf.nextInt();
                enderecos.add(new Endereco(rua,numero));
            }
            pessoas.add(new Pessoa(nome, idade, enderecos));
             System.out.println(pessoas.get(i).getNome()+pessoas.get(i).getIdade()+pessoas.get(i).getEnderecos().get(i).getRua()+pessoas.get(i).getEnderecos().get(i).getNumero());
            enderecos.clear();
        }


    }
}