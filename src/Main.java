import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menu principal
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("0. Encerrar Programa");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        // Menu Opção 1
                        //handleOption1(scanner);
                        break;
                    case 2:
                        // Menu Opção 2
                        //handleOption2(scanner);
                        break;
                    case 3:
                        // Menu Opção 3
                        //handleOption3(scanner);
                        break;
                    case 4:
                        // Menu Opção 4
                        //handleOption4(scanner);
                        break;
                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.next(); // Limpa o buffer de entrada
                choice = -1; // Define uma opção inválida para continuar o loop
            }

        } while (choice != 0);

        scanner.close();
    }
}
