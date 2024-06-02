package com.alura.challengeone.modelos;

import java.util.Map;

public record ExchangeResponse(String result,
                               String baseCode,
                               Map<String, Double> conversionRates) {
}
