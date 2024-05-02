import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da Agência: ");
        int num_agencia = sc.nextInt();
        
        System.out.print("Digite o código da Agência: ");
        String codigo_agencia = sc.next();
        
        System.out.print("Digite o seu nome: ");
        String nome = sc.next();

        System.out.print("Digite o seu saldo: ");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + codigo_agencia + ", conta " + num_agencia + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}
