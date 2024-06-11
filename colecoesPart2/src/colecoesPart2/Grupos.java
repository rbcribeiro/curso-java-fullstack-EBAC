package colecoesPart2;

import java.util.*;

public class Grupos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();
        String continuar;

        do {
            String nomeSexo;
            String[] partes;
            String nome, sexo;

            System.out.println("Digite o nome, uma vírgula e o sexo (feminino/masculino): ");
            nomeSexo = leia.nextLine();
            partes = nomeSexo.split(",");
            
            if (partes.length == 2) {
                nome = partes[0].trim();
                sexo = partes[1].trim();

                if (sexo.equalsIgnoreCase("masculino")) {
                    masculino.add(nome);
                } else if (sexo.equalsIgnoreCase("feminino")) {
                    feminino.add(nome);
                } else {
                    System.out.println("Sexo inválido. Use 'feminino' ou 'masculino'.");
                }

                System.out.printf("Nome: %s, Sexo: %s%n", nome, sexo);
            } else {
                System.out.println("Entrada inválida. Certifique-se de usar uma vírgula para separar o nome e o sexo.");
            }

            System.out.println("Deseja adicionar outra pessoa? (sim/não)");
            continuar = leia.nextLine().trim();
        } while (continuar.equalsIgnoreCase("sim"));

        leia.close();

        System.out.println("Lista de nomes masculinos: " + masculino);
        System.out.println("Lista de nomes femininos: " + feminino);
    }
}
