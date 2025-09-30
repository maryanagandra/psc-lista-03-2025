
import java.util.Scanner;

public class MaquinaDeVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o valor da compra: R$ ");
        int valorCompra = sc.nextInt();

        System.out.print("Digite o valor pago: R$ ");
        int valorPago = sc.nextInt();

        
        if (valorPago < valorCompra) {
            System.out.println("Pagamento insuficiente! Compra não realizada.");
        } else {
            int troco = valorPago - valorCompra;
            System.out.println("Troco: R$ " + troco);

            
            int[] notas = {50, 20, 10, 5, 2, 1};

            for (int nota : notas) {
                int quantidade = troco / nota; // quantas notas dessa são necessárias
                troco = troco % nota; // atualiza o valor do troco restante
                System.out.println("Notas de R$ " + nota + ",00: " + quantidade);
            }
        }

        sc.close();
    }
}
