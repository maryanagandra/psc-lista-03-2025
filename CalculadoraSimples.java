
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /, ^): ");
        char operacao = sc.next().charAt(0);

        double resultado;

       
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado = " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado = " + resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado = " + resultado);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida!");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado = " + resultado);
                }
                break;

            case '^':
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado = " + resultado);
                break;

            default:
                System.out.println("Erro: símbolo de operação inválido!");
        }

        sc.close();
    }
}
