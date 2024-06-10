package hello;

import java.util.Scanner;

public class ConverterNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        
        int numeroPrimitivo = scanner.nextInt();
        
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);
        
        System.out.println("Valor primitivo: " + numeroPrimitivo);
        System.out.println("Valor wrapper: " + numeroWrapper);
        
        scanner.close();
    }
}
