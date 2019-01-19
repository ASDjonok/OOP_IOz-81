import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = 1;
        char b = (char) scanner.nextInt();
        System.out.println("b=" + b);
        if (b != 0) {
            System.out.println(a / (float) b);
        } else {
            System.out.println("Деление на ноль!");
        }
    }
}
