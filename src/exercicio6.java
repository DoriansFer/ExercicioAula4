import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo a Princess Store! Qual o valor da sua compra?");
        double valor = scanner.nextDouble();
        if (valor > 200) {
            valor = valor - (valor * 0.10);
            System.out.println("Desconto de 10% aplicado, valor final: R$" + valor);
        } else if (valor >= 100 && valor <= 200) {
            valor = valor - (valor * 0.05);
            System.out.println("Desconto de 5% aplicado, valor final: R$" + valor);
        } else {
            System.out.println("Certo, não descontos disponíveis para este valor. Valor final da sua compra: R$" + valor);
        }

        System.out.println("Qual a forma de pagamento? \n   Opção 1: Cartão de crédito\n" +
                "   Opção 2: Boleto bancário\n" +
                "   Opção 3: Transferência bancária");

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Por favor, digite os dados do seu cartão.");
                break;
            case 2:
                System.out.println("O prazo de compensação é de até 3 dias úteis, a compra será liberada após a confirmação de pagamento. " +
                        "\nPor favor baixe o boleto no botão a seguir");
                break;
            case 3:
                System.out.println("Leia o QRCode a seguir no seu Banco de preferência, para realizar o pagamento");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
