import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the conversion direction (C for Celsius to Fahrenheit, F for Fahrenheit to Celsius):");
        char direction = scanner.next().toUpperCase().charAt(0);

        if (direction == 'C') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        } else if (direction == 'F') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is equal to " + celsius + " Celsius.");
        } else {
            System.out.println("Invalid conversion direction. Please enter 'C' or 'F'.");
        }
        
        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
