import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numeroUm = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numeroDois = sc.nextInt();
        sc.close();

        try {
            contar(numeroUm, numeroDois);
        } 
        catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
        
    }
    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        if (numeroUm < numeroDois) {
            int contagem = numeroDois - numeroUm;
            for(int x = 1; x <= contagem; x++) {
                System.out.println("Imprimindo o número:" + x);
            }
        }
        else {
            throw new ParametrosInvalidosException();
        }
    }
}
