import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number");
        int num1 = scanner.nextInt();
        if(num1 < 0){
            System.out.println("This is a negative number");
        } else if (num1>0){
            System.out.println("This is a positive number");
        } else {
            System.out.println("This number is equal to 0");
        }

    }
}
