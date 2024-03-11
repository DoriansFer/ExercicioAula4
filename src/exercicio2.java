import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma, multi, div, sub;
        System.out.println("Olá usuário, por favor, digite um número");
        int num1 = scanner.nextInt();
        System.out.println("Obrigada, digite mais um número, por favor.");
        int num2 = scanner.nextInt();
        soma = num2 + num1;
        div = num1 / num2;
        sub = num1 - num2;
        multi = num1 * num2;

        System.out.println("Perfeito! Você sabia, que a soma desses números é igual a: " + soma + "?" +
                "\n E a subtração de " + num1 + " - " + num2 + " é igual a: " + sub + "? \n E se fizermos a multiplicação de " + num1 + " * " + num2 +
                " o resultado é igual a: " + multi + "!!"
                + "\n Também podemos realizar a divisão entre os números... Sendo " + num1 + " / " + num2 + " igual a: " + div + ".");
    }
}
