import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int Numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        String Agencia = scanner.nextLine();
        System.out.println("Por favor, digite seu Nome Completo!");
        String Cliente = scanner.nextLine();
        System.out.println("Por favor, digite o Saldo!");
        double Saldo = scanner.nextDouble();

        scanner.close();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.%n", Cliente, Agencia, Numero, Saldo);
    }
}