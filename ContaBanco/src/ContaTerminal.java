import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try(Scanner scanner = new Scanner(System.in)) {

        System.out.println("Conta bancária");

        System.out.print("Por favor, informe o agência: ");
        String agencia = scanner.next();

        System.out.print("Informe o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Informe o seu nome: ");
        String nome = scanner.next();

        System.out.print("Informe o saldo disponível: ");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", nome, agencia, numero, saldo);

        }
    }
}
