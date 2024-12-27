import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Contact> contatos = new ArrayList<>();
        while (true){
            System.out.println("Escolha a opção que deseja" +
                    "1- Listar contatos" +
                    "2- Adicionar contato" +
                    "3- Editar contato" +
                    "4- Excluir contato" +
                    "0- Sair");
            int opcao = Integer.parseInt(read.nextLine());

            switch (opcao){
                case 1:
                    if (contatos.isEmpty()){
                        System.out.println("Sua lista de contatos está vazia");
                        continue;
                    }
                    System.out.println("Seus contatos:");
                    // Listar os contatos
                case 2:
                    Contact contato = new Contact();
                    System.out.println("Informe o nome do seu contato");
                    String nome = read.nextLine();
                    contato.setFullName(nome);
                    System.out.println("Informe o número do seu contato");
                    String numero = read.nextLine();
                    contato.setPhone(numero);
                case 3:
                    //Editar contato
                case 4:
                    //Excluir contato
                case 0:
                    System.out.println("Adeus!");
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
            }

        }
    }

}