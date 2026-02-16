package Aula001.Exercicios;

import java.util.Locale;

public class Exercicio001 {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double price3 = 53.234567;

        System.out.printf("Products:\n%s, which price is $ %.2f\n%s, which price is $ %.2f\n\n",product1, price1,
                product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c\n",age, code, gender);
        System.out.printf("Measue with eight decimal places: %.6f\nRouded (three decimal places): %.3f\n", price3,
                price3);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", price3);
    }
}
