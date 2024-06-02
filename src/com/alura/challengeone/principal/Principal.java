package com.alura.challengeone.principal;

import com.alura.challengeone.modelos.ConvertidorDivisas;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese el origen");
//        String origen = scanner.nextLine();

        ConvertidorDivisas convertidor = new ConvertidorDivisas();

//        double res = convertidor.convertidor(origen, "USD", 100);
//
//        System.out.println("res = " + res);
        String apiKey = System.getenv("EXCHANGE_API_KEY");
        System.out.println("API Key: " + apiKey);
        
        while (true) {
            System.out.println("******************************");
            System.out.println("Conversor de moneda");
            System.out.println("1) Dollar ==> Peso Mexicano");
            System.out.println("2) Peso Mexicano ==> Dollar");
            System.out.println("3) Dollar ==> Real Brasileiro");
            System.out.println("4) Real Brasileiro ==> Dollar");
            System.out.println("5) Dollar ==> Preso Argentino");
            System.out.println("6) Preso Argentino ==> Dollar");
            System.out.println("7) Salir");
            System.out.println("******************************");

            int numero = scanner.nextInt();
            if (numero == 7) {
                break;
            }
            if (numero == 1) {
                System.out.println("Ingrese el monto: ");
                double monto = scanner.nextDouble();
                System.out.println("El monto " + monto + " [USD] corresponde a ===> " + convertidor.convertidor("USD",
                        "MXN", monto)+ " [MXN]") ;
            }
            if (numero == 2) {
                System.out.println("Ingrese el monto: ");
                double monto = scanner.nextDouble();
                System.out.println("El monto " + monto + " [MXN] corresponde a ===> " + convertidor.convertidor("MXN",
                        "USD", monto)+ " [USD]") ;
            }
            if (numero == 3) {
                System.out.println("Ingrese el monto: ");
                double monto = scanner.nextDouble();
                System.out.println("El monto " + monto + " [USD] corresponde a ===> " + convertidor.convertidor("USD",
                        "BRL", monto)+ " [BRL]") ;
            }
            if (numero == 4) {
                System.out.println("Ingrese el monto: ");
                double monto = scanner.nextDouble();
                System.out.println("El monto " + monto + " [BRL] corresponde a ===> " + convertidor.convertidor("BRL",
                        "USD", monto)+ " [USD]") ;
            }
            if (numero == 5) {
                System.out.println("Ingrese el monto: ");
                double monto = scanner.nextDouble();
                System.out.println("El monto " + monto + " [USD] corresponde a ===> " + convertidor.convertidor("USD",
                        "ARS", monto)+ " [ARS]") ;
            }
            if (numero == 6) {
                System.out.println("Ingrese el monto: ");
                double monto = scanner.nextDouble();
                System.out.println("El monto " + monto + " [ARS] corresponde a ===> " + convertidor.convertidor("ARS",
                        "USD", monto)+ " [USD]") ;
            }

        }


    }
}
