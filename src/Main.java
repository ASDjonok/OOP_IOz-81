import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = 1;
//        char b = (char) scanner.nextInt();
        char b = 4;
        System.out.println("b=" + b);
        if (b != 0) {
            System.out.println(a / (float) b);
        } else {
            System.out.println("Деление на ноль!");
        }

        int S = 0;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                S = S + (i + j);
            }
        }
        System.out.println(S);

        //Задачка (изменить один символ, чтобы
        //напечатало 20 звёздочек
        // (Java - 2 решения, а С/C++ - +1 решение
        int i, N=20;
        for(i = 0 ; i < N ; i--)
            System.out.println("*");
    }
}
