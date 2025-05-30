import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Calcula a temperatura em Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Calcula a temperatura em Kelvin
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.println("\nTemperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        // Fecha o scanner
        scanner.close();
    }
}

