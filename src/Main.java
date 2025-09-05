import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DarthWinter darthWinter = new DarthWinter.DarthWinterBuilder("Darth Winter")
                .lifeScore(2500)
                .attack(100)
                .defense(50)
                .atkFrozenBlade(350)
                .atkZeroForce(450)
                .build();

        Stormtrooper stormtrooper = new Stormtrooper.StormtrooperBuilder("Stormtrooper")
                .attack(75)
                .defense(0)
                .atkBlasterShoot(100)
                .build();

        Jedi jedi = new Jedi.JediBuilder("Muhi Katarth")
                .lifeScore(500)
                .attack(75)
                .defense(50)
                .atkForceImplosion(250)
                .atkThePowerOfTheVoid(450)
                .credits(100)
                .build();


        System.out.println("Nos confins não mapeados da galáxia, em um mundo esquecido pelo tempo,\n"
                + "um Guardião encontrou seu refúgio. Ali, em uma campina que florescia com cores que\n" +
                "a República jamais catalogou, ele meditava. Por eras, aquele planeta foi seu lar,\n" +
                "seu santuário, seu exílio. \n");

        System.out.println("Lentamente, como se despertasse de um sono de séculos, ele se ergue.\n" +
                "Seus movimentos são fluidos, um contraste com a imobilidade da paisagem.\n" +
                "O olhar, carregado de eras, não se volta para o campo florido, mas para a abóbada celeste. \n");

        System.out.println("E lá estava. O paradoxo que definia seus dias: um sol vibrante, uma fornalha de\n" +
                "vida e esperança, travando uma eterna dança no horizonte com a fome silenciosa de um buraco negro,\n" +
                "uma ferida de escuridão absoluta no veludo do cosmos.\n");


        Scanner choice = new Scanner(System.in);
        System.out.println("01 - Fazer a ronda.\n" +
                "02 - Ir para casa.\n" +
                "Escolha 01 ou 02:");

        int choice01 = choice.nextInt();
        choice.close();

        if (choice01 == 01) {
            System.out.println("\n" +
                    "Sua ronda diária era um ritual, uma meditação em movimento traçada por caminhos que\n" +
                    "seus pés conheciam melhor que sua memória. O perímetro de seu santuário. Mas naquele dia, a harmonia\n" +
                    "foi quebrada. Um brilho metálico, antinatural contra as pétalas vibrantes, capturou seu olhar.\n" +
                    "Ali, onde a campina encontrava a rocha, jazia a carcaça de um pequeno droide. Estava em pedaços,\n" +
                    "um de seus fotorreceptores ainda piscando uma luz vermelha, fraca e moribunda. O rastro de sua\n" +
                    "destruição terminava aos pés da entrada sombria de uma caverna, uma fissura na montanha que ele\n" +
                    "sempre sentira ser melhor não explorar");
        } else {
            System.out.println("Ir para casa leva ele a uma emboscada,  a força o avisa.");
        };
    }

}