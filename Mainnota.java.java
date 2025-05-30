import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        double[] notas = new double[8];
        double media1Bimestre, media2Bimestre, media1Semestre, media2Semestre, mediaFinal;

        // Entrada das notas
        System.out.println("Digite as 8 notas anuais do aluno:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias
        media1Bimestre = (notas[0] + notas[1]) / 2;
        media2Bimestre = (notas[2] + notas[3]) / 2;
        media1Semestre = (media1Bimestre + media2Bimestre) / 2;
        media2Bimestre = (notas[4] + notas[5]) / 2;
        media2Semestre = (media2Bimestre + media2Bimestre) / 2;
        mediaFinal = (media1Semestre + media2Semestre) / 2;

        // Saída dos resultados
        System.out.println("\nResultados:");
        System.out.println("1º Bimestre: " + media1Bimestre);
        System.out.println("2º Bimestre: " + media2Bimestre);
        System.out.println("1º Semestre: " + media1Semestre);
        System.out.println("2º Semestre: " + media2Semestre);
        System.out.println("Média Final: " + mediaFinal);

        scanner.close();
    }
}

