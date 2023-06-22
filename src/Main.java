import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int opcao;

        System.out.println("Olá, me chamo Guilherme e esse é o meu primeiro programa em JAVA.");
        System.out.print("Como você se chama? ");
        nome = scanner.nextLine();
        System.out.println("Olá " + nome + ", nesse programa você consegue efetuar cálculos simples");

        do {
            System.out.println("----MENU DE OPÇÕES----");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO");
            System.out.print("O que você deseja fazer? (0 para sair): ");
            opcao = scanner.nextInt();

            process(opcao);
        } while (opcao != 0);

        System.out.println("\nEspero ter ajudado, até logo " + nome);

    }

    public static void process(int opcao) {
        Scanner scanner = new Scanner(System.in);
        switch (opcao) {
            case 1 -> {

                System.out.println("SOMA DE DOIS NÚMEROS \n");
                System.out.print("Digite o primeiro número: ");
                int numero1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();

                int resultado = numero1 + numero2;

                System.out.println("\nO resultado da soma é: " + resultado + "\n");

            }
            case 2 -> {

                System.out.println("SUBTRAÇÃO DE DOIS NÚMEROS \n");
                System.out.print("Digite o primeiro número: ");
                int numero1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();

                int resultado = numero1 - numero2;

                System.out.println("\nO resultado da subtração é: " + resultado + "\n");

            }
            case 3 -> {

                System.out.println("MULTIPLICAÇÃO DE DOIS NÚMEROS \n");
                System.out.print("Digite o primeiro número: ");
                int numero1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();

                int resultado = numero1 * numero2;

                System.out.println("\nO resultado da multiplicação é: " + resultado + "\n");

            }
            case 4 -> {

                System.out.println("DIVISÃO DE DOIS NÚMEROS \n");
                System.out.print("Digite o primeiro número: ");
                double numero1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                double numero2 = scanner.nextInt();

                double resultado = numero1 / numero2;

                if (numero2 == 0) {
                    System.out.println("\nImpossível dividir por zero");
                } else {
                    System.out.println("\nO resultado da divisão é: " + resultado);
                }

            }
            default -> {

                if (opcao > 4) {
                    System.out.println("Opção inválida, tente novamente :) \n");
                }

            }
        }
    }
}