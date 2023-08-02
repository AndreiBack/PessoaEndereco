import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {

            switch (menuInicial(scan)){
                case 1 -> Pessoa.cadastrarPessoa(pessoas, scan);
                case 2 -> Pessoa.mostrarPessoa(pessoas, scan);
                case 3 -> Pessoa.mostrarTodos(pessoas);
                case 0 -> System.exit(0);
                default -> System.out.println("Numero invalido, bota oq ta na tela ae");
            }
        }
    }

    static int menuInicial(Scanner scan){
        System.out.println("");
        System.out.println("|Sistema de reconhecimento civil|");
        System.out.println("|Digite um numero para executar uma ação|");
        System.out.println("1 - Cadastrar pessoa");
        System.out.println("2 - Mostrar pessoa");
        System.out.println("3 - Mostrar todos cadastrados");
        System.out.println("0 - Sair");
        System.out.println("");

        return scan.nextInt();
    }
}