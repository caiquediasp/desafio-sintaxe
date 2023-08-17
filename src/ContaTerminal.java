import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Informe o número da conta: ");
        numero = sc.nextInt();

        System.out.println("Informe o número da agência: ");
        agencia = sc.next();

        System.out.println("Informe seu nome: ");
        nome = sc.next();

        System.out.println("Informe o seu saldo: ");
        saldo = sc.nextDouble();

        System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
