import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Contact> contatos = new ArrayList<>();
        while (true){
            System.out.println("""
                    Escolha a opção que deseja:
                    1- Listar contatos
                    2- Adicionar contato
                    3- Editar contato
                    4- Excluir contato
                    0- Sair
                    """);
            int opcao = Integer.parseInt(read.nextLine());

            switch (opcao){
                case 1:
                    if (contatos.isEmpty()){
                        System.out.println("Sua lista de contatos está vazia");
                        continue;
                    }
                    System.out.println("Seus contatos:");
                    for(int i = 0; i < contatos.size(); i++){
                        System.out.println( i+1 + " - " + contatos.get(i).getFullName() + " (" + contatos.get(i).getPhone() + ")");
                    }
                    break;
                case 2:
                    Contact contato = new Contact();
                    System.out.println("Informe o nome do seu contato");
                    String nome = read.nextLine();
                    contato.setFullName(nome);
                    System.out.println("Informe o número do seu contato");
                    String numero = read.nextLine();
                    contato.setPhone(numero);
                    contatos.add(contato);
                    break;
                case 3:
                    if (contatos.isEmpty()){
                        System.out.println("Não há contatos para editar");
                        continue;
                    }
                    System.out.println("Digite o número referente ao contato que deseja editar");
                    int indexEdit = Integer.parseInt(read.nextLine());
                    try {
                        contato = contatos.get(indexEdit-1);
                    }
                    catch (Exception e) {
                        System.out.println("Não existe um contato referente ao número informado");
                        continue;
                    }
                    System.out.println("""
                            Escolha o que deseja editar:
                            1- Nome
                            2- Telefone
                            0- Voltar
                            """);
                    int opcaoEdit = Integer.parseInt(read.nextLine());
                    switch (opcaoEdit){
                        case 1:
                            System.out.println("Informe o novo nome do seu contato");
                            String novoNome = read.nextLine();
                            contato.setFullName(novoNome);
                            break;
                        case 2:
                            System.out.println("Informe o novo número do seu contato");
                            String novoNumero = read.nextLine();
                            contato.setPhone(novoNumero);
                            break;
                        case 0:
                            continue;
                    }
                    System.out.println("Contato editado com sucesso");
                    break;
                case 4:
                    if (contatos.isEmpty()){
                        System.out.println("Não há contatos para excluir");
                        continue;
                    }
                    System.out.println("Digite o número referente ao contato que deseja excluir");
                    int indexDestroy = Integer.parseInt(read.nextLine());
                    try {
                        contatos.remove(indexDestroy -1);
                    }
                    catch (Exception e) {
                        System.out.println("Não existe um contato referente ao número informado");
                        continue;
                    }
                    System.out.println("Contato excluido com sucesso");
                    break;
                case 0:
                    System.out.println("Adeus!");
                    return;
                default:
                    System.out.println("Escolha uma opção válida!");
            }

        }
    }

}
