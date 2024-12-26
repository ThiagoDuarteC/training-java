import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Player> players = new ArrayList<>();
        List<Player> winners = new ArrayList<>();

        System.out.println("Informe o número de jogadores");
        int playerNumbers = Integer.parseInt(read.nextLine());
        for (int i = 1; i <= playerNumbers; i++) {
            Player player = new Player();
            System.out.println("Informe o nome do jogador");
            String name = read.nextLine();
            player.setName(name);
            System.out.println("Informe o número escolhido (de 0 a 9)");
            int number = Integer.parseInt(read.nextLine());
            player.setChosenNumber(number);
            players.add(player);
        }

        int randomNumber = new Random().nextInt(10);

        players.forEach(player -> {
            if(player.getChosenNumber() == randomNumber){
                winners.add(player);
            }
        });

        if(winners.isEmpty()){
            System.out.println("Não houve ganhador");
        } else if (winners.size() == 1) {
            System.out.println("O ganhador foi:");
            System.out.println(winners.getFirst().getName());
        } else {
            System.out.println("Os ganhadores foram:");
            winners.forEach(winner -> {
                System.out.println(winner.getName());
            });
        }
    }

}
