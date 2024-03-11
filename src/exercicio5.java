import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int number = scanner.nextInt();
        if (number <0){
            System.out.println("Este é um número negativo");
        }else if (number > 0) {
            System.out.println("Este é um número positivo");
        }

        int absoluto = Math.abs(number);

        switch (absoluto % 2){
            case 0:
                System.out.println("É um número par");
                break;
            case 1:
                System.out.println("É um número ímpar");
                break;
            default:
                System.out.println("Não é um número válido");
                break;
        }

    }
}
