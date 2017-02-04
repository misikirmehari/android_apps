package com.example.misikirmehari.temperatureconverter; /**
 * Created by misikirmehari on 2/4/17.
 */

public class ConverterUtil {
    public static float convertFahrenheitToCelsius(float fahrenheit){
        return((fahrenheit - 32) * 5 / 9);
    }

    public static float convertCelsiusToFahrenheit(float celsius){
        return((celsius * 9) / 5) + 32;

    }

}
