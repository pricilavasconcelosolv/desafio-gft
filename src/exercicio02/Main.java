package exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número:");

        int number = scanner.nextInt();
        ArrayList<String> divisivelPor = new ArrayList<>();

        if (number % 3 == 0) {
            divisivelPor.add("3");
        }

        if (number % 6 == 0) {
            divisivelPor.add("6");
        }

        if (number % 7 == 0) {
            divisivelPor.add("7");
        }

        System.out.println("Divisível por " +
                String.join(", ", divisivelPor));
    }
}