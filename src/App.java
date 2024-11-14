import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Digite um número:");
        n1 = scan.nextInt();

        System.out.println("Digite outro número:");
        n2 = scan.nextInt();

        System.out.println("Digite o operador (+, -, *, /):");
        char operator = scan.next().charAt(0);

        scan.close();

        int result;

        switch (operator) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if (n2 != 0) { // Avoid division by zero
                    result = n1 / n2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }

        System.out.println("Resultado da operação: " + n1 + " " + operator + " " + n2 + " = " + result);
    }
}


