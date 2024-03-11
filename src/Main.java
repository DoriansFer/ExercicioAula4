import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Olá usuário, por favor, me informe seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Obrigada "+nome+", agora me informe sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Bem-vindo! Seu nome é "+nome+" e você tem: "+idade+"anos");

    }
}