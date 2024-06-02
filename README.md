### README

# Convertidor de Divisas

Este proyecto es un programa de consola en Java que permite convertir cantidades de una moneda a otra utilizando datos en tiempo real de la API de ExchangeRate-API.

## Descripción

El programa principal ofrece un menú interactivo que permite al usuario seleccionar las conversiones de moneda que desea realizar. Utiliza la API de ExchangeRate-API para obtener las tasas de cambio más recientes y realizar las conversiones solicitadas.

## Estructura del Proyecto

El proyecto consta de las siguientes clases:

- **ExchangeRateResponse**: Clase que representa la respuesta de la API de ExchangeRate-API, contiene campos para el resultado, el código base y un mapa de tasas de conversión.
- **ConvertidorDivisas**: Clase que contiene la lógica para llamar a la API y realizar las conversiones de divisas.
- **Principal**: Clase que contiene el método `main` y el menú interactivo para el usuario.

## Uso

### Clase `ExchangeRateResponse`

Esta clase modela la respuesta JSON de la API de ExchangeRate-API, incluyendo el resultado de la solicitud, el código de la moneda base y un mapa con las tasas de conversión.

### Clase `ConvertidorDivisas`

Esta clase contiene el método `convertidor` que llama a la API de ExchangeRate-API y realiza la conversión de divisas. El método toma como parámetros la moneda de origen, la moneda de destino y el monto a convertir. Devuelve el monto convertido utilizando la tasa de cambio obtenida de la API.

### Clase `Principal`

Esta clase contiene el menú interactivo que permite al usuario seleccionar y realizar las conversiones de divisas. El usuario puede elegir entre varias opciones de conversión y el programa utilizará el `ConvertidorDivisas` para realizar la conversión y mostrar el resultado.

## Requisitos

- Java 11 o superior
- Dependencia de Gson para el manejo de JSON

## Instalación

1. Clona este repositorio.
2. Asegúrate de tener Java y Maven instalados.
3. Agrega la dependencia de Gson en tu archivo `pom.xml` si usas Maven:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version>
</dependency>
```

4. Compila y ejecuta el programa.

## Uso

1. Ejecuta el programa.
2. Selecciona la opción deseada del menú.
3. Ingresa el monto a convertir.
4. El programa mostrará el monto convertido en la moneda de destino.

## Notas

- Asegúrate de tener una conexión a Internet activa para que el programa pueda acceder a la API de ExchangeRate-API.
- En caso de error en la API, el programa lanzará una excepción y mostrará un mensaje de error en la consola.

## Licencia

Este proyecto está licenciado bajo la [MIT License](LICENSE).

---
