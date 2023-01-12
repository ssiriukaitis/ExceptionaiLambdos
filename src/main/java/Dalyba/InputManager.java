package Dalyba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {



    private static int insertDigit(String skaiciausSeka){
        Scanner scanner = new Scanner(System.in);
        int ivestasSkaicius = 0;
        boolean arIvestasSveikasSkaicius = false;

        do {
            try {
                System.out.println("Iveskite"  + skaiciausSeka + "sveika skaiciu");
                ivestasSkaicius = scanner.nextInt();
                arIvestasSveikasSkaicius = true;
            } catch (InputMismatchException e) {
                System.out.println("Klaida. Galima ivesti tik sveika skaiciu");
                scanner.nextLine();
                arIvestasSveikasSkaicius = false;
            } catch (Exception e) {
                System.out.println("Ivyko nezinoma klaida");
            } finally {
                scanner.nextLine();


            }
        }  while (!arIvestasSveikasSkaicius);

        return ivestasSkaicius;

    }
    public static String[] askForInput(){

        Integer pirmasSkaicius = insertDigit("Pirma");
        int antrasSkaicius = insertDigit("Antra");

        return new String[]{
                pirmasSkaicius.toString(),
                String.valueOf(antrasSkaicius)
        };

    }
}
