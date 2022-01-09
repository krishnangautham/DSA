/*
 * Given a temperature in celsius C. 
 * You need to convert the given temperature to Fahrenheit.
 */
package com.gautham.dsa.mathematics;

import java.util.Scanner;

/**
 *
 * @author gauth
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt(); //Number of test cases
        while (testCases > 0) {
            int temperatureInCelsius = sc.nextInt();
            CelsiusToFahrenheit celsiusToFahrenheit = new CelsiusToFahrenheit();
            System.out.println(celsiusToFahrenheit.convertToFahrenheit(temperatureInCelsius));
            testCases--;
        }
    }

    public double convertToFahrenheit(int temperatureInCelsius) {
        double temperatureInFahrenheit = ((temperatureInCelsius * 9 ) / 5) + 32;
        return temperatureInFahrenheit;
    }

}
