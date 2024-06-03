package org.CristianLedesma;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int opcionUser;
        boolean iniciarPrograma = true;
        String URL = "";
        int valorConvertir = 0;

        do{
            System.out.println("----CONVERSOR DE MONEDAS----");
            System.out.println("Opciones disponibles: ");
            System.out.println("1-) DOP || EUR");
            System.out.println("2-) USD || EUR");
            System.out.println("3-) GBP || USD");
            System.out.println("4-) JPY || USD");
            System.out.println("5-) CAD || AUD");
            System.out.println("6-) EUR || GBP");
            System.out.println("7-) MXN || USD");
            System.out.println("8-) INR || GBP");
            System.out.println("9-) KRW || JPY");
            System.out.println("10-) RUB || EUR");
            System.out.println("11-) CNY || USD");
            System.out.println("12-) Salir del programa...");

            System.out.println("Elije una opción del menú: ");
            opcionUser = scanner.nextInt();

            if (opcionUser >= 1 && opcionUser <= 11) {
                System.out.println("Ingresa la cantidad a convertir: ");
                valorConvertir = scanner.nextInt();
                URL = "https://v6.exchangerate-api.com/v6/b8098c934cbd5fbc87f490ff/pair/";
            } else if (opcionUser == 12) {
                iniciarPrograma = false;
            } else {
                System.out.println("Opción no válida. Por favor, elija una opción del menú.");
            }

            switch (opcionUser) {
                case 1:
                    URL += "DOP/EUR/" + valorConvertir;
                    break;
                case 2:
                    URL += "USD/EUR/" + valorConvertir;
                    break;
                case 3:
                    URL += "GBP/USD/" + valorConvertir;
                    break;
                case 4:
                    URL += "JPY/USD/" + valorConvertir;
                    break;
                case 5:
                    URL += "CAD/AUD/" + valorConvertir;
                    break;
                case 6:
                    URL += "EUR/GBP/" + valorConvertir;
                    break;
                case 7:
                    URL += "MXN/USD/" + valorConvertir;
                    break;
                case 8:
                    URL += "INR/GBP/" + valorConvertir;
                    break;
                case 9:
                    URL += "KRW/JPY/" + valorConvertir;
                    break;
                case 10:
                    URL += "RUB/EUR/" + valorConvertir;
                    break;
                case 11:
                    URL += "CNY/USD/" + valorConvertir;
                    break;
                case 12:
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                    break;
            }
            Conversion.solicitudConversion(URL, valorConvertir);
        } while(iniciarPrograma);
    }


}
