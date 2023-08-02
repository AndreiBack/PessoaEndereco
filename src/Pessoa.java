import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;

    private List<Endereco> enderecos;

    public Pessoa(){
    }

    public Pessoa(String nome, int idade, List<Endereco> enderecos) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }


    static void cadastrarPessoa(List<Pessoa> pessoas, Scanner scan) {
        System.out.println("");
        System.out.println("Digite o nome: ");
        scan.nextLine();
        String nome = scan.nextLine();
        System.out.println("");
        System.out.println("Digite a idade: ");
        int idade = scan.nextInt();

        List<Endereco> enderecos = Endereco.cadastrarEnderecos(scan);

        pessoas.add(new Pessoa(nome, idade, enderecos));
        System.out.println("Cadastrou com sucesso, grande dia!");
    }


    static void mostrarPessoa(List<Pessoa> pessoas, Scanner scan){
        System.out.println("Digite o nome: ");
        scan.nextLine();
        String nome = scan.nextLine();
        boolean find = false;

        for (Pessoa pessoa : pessoas)
        {
            if (pessoa.getNome().equals(nome)){
                System.out.println("");
                System.out.println(pessoa.getNome() + ", " + pessoa.getIdade() + " anos");
                System.out.println("Endereços:");
                for (int i = 0; i < pessoa.getEnderecos().size(); i++)
                {
                    System.out.println(pessoa.getEnderecos().get(i).getRua() + ", " + pessoa.getEnderecos().get(i).getNumero());
                }
                System.out.println("");

                find = true;
            }
        }

        if (!find){
            System.out.println("Nao encontrei não, meu mano, nem existe");
            System.out.println("");
        }
    }
    static void mostrarTodos(List<Pessoa> pessoas) {

    if (pessoas.isEmpty()) {
        System.out.println("Nenhuma pessoa foi cadastrada ainda nao, cadastra ae meu nobre.");
        return;
    }

    for (Pessoa pessoa : pessoas) {
        System.out.println("");
        System.out.println("Sim, eu fiz coisas a mais \n");
        System.out.println("Nome: " + pessoa.getNome() + ", " + pessoa.getIdade() + " anos");
        System.out.println("Endereços:");
        for (Endereco endereco : pessoa.getEnderecos()) {
            System.out.println(endereco.getRua() + ", " + endereco.getNumero());
        }
        System.out.println("");
    }
}
}