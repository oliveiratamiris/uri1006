package org.example;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double a, b, c, mediaPoderada;

        a = sc.nextDouble();

        b = sc.nextDouble();

        c = sc.nextDouble();

        if((a >= 0.0 ) &&  (a <= 10.0) && (b >= 0.0 ) &&  (b <= 10.0) && (c >= 0.0 ) &&  (c <= 10.0)){
            mediaPoderada = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("MEDIA = %.1f%n", mediaPoderada);
        }else{
            System.out.println("Nota inválida");
        }


        sc. close();
    }
}