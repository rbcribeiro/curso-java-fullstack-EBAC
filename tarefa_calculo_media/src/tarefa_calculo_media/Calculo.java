package tarefa_calculo_media;

import java.util.*;

public class Calculo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner leia = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a 1ª nota: ");
        nota1 = leia.nextDouble();

        System.out.println("Digite a 2ª nota: ");
        nota2 = leia.nextDouble();

        System.out.println("Digite a 3ª nota: ");
        nota3 = leia.nextDouble();

        System.out.println("Digite a 4ª nota: ");
        nota4 = leia.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A nota média é de %.2f", media);
        leia.close();
    }
}
