
import java.util.Scanner;
import java.util.Random;

public class SorteioParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

      
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

       
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

       
        int numeroSorteado = rand.nextInt(maior - menor + 1) + menor;

    
        System.out.print("Número sorteado: " + numeroSorteado + " - ");
        if (numeroSorteado % 2 == 0) {
            System.out.println("é par.");
        } else {
            System.out.println("é ímpar.");
        }

        sc.close();
    }
}
