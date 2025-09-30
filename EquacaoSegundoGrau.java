
import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();


        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        }

        else if (a == 0 && b != 0) {
            double raiz = -c / b;
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("Raiz: x = " + raiz);
        }
      
        else {
            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                double r
