package com.alura.challengeone.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConvertidorDivisas {

    public double convertidor (String monedaOrigen, String monedaDestino, double monto) {
        
        String url = "https://v6.exchangerate-api.com/v6/a54cfc6def3b03e7e6b40072/latest/" + monedaOrigen;

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String data = response.body();
//            System.out.println("data = " + data);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            ExchangeRateResponse exchangeResponse = gson.fromJson(data, ExchangeRateResponse.class);

//            System.out.println("exchangeResponse = " + exchangeResponse);

            // Verifica si la respuesta es exitosa
            if (!"success".equals(exchangeResponse.getResult())) {
                throw new RuntimeException("Error en la respuesta de la API");
            }

            // Obtén la tasa de conversión para la moneda de destino
            Map<String, Double> conversionRates = exchangeResponse.getConversionRates();
            Double tasaConversion = conversionRates.get(monedaDestino);

            if (tasaConversion == null) {
                throw new RuntimeException("Moneda de destino no encontrada en la respuesta de la API");
            }

            // Calcula el monto convertido
            double montoConvertido = monto * tasaConversion;
            return montoConvertido;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }
}
