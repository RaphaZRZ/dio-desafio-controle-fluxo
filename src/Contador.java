import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            obterValores();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int validarValores(int primeiroValor, int segundoValor) throws ParametrosInvalidosException {
        if (primeiroValor > segundoValor)
            throw new ParametrosInvalidosException();
        return segundoValor - primeiroValor;
    }

    public static void imprimirValores(int range) {
        for (int i = 0; i < range; i++)
            System.out.printf("Imprimindo o %d° valor.\n", i+1);
    }

    public static void obterValores() throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o 1° valor inteiro: ");
        int primeiroValor = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o 2° valor inteiro: ");
        int segundoValor = sc.nextInt();
        sc.nextLine();

        int range = validarValores(primeiroValor, segundoValor);
        imprimirValores(range);
    }
}