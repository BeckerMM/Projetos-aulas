import java.util.Scanner;

public class git {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double num = 0.0, numMaior = 0.0, numMenor = 0.0;
        int contador = 0;
        while (num >= 0) {

            System.out.println("Digite um número:");
            num = sc.nextDouble();
            if (num < 0) {
                break;
            }
            if (contador == 0) {
                numMaior = num;
                numMenor = num;
            }
            if (num > numMaior) {
                numMaior = num;
            }
            if (numMenor > num) {
                numMenor = num;
            }
            contador++;
        }
        System.out.println("Número maior igual a: " + numMaior);
        System.out.println("Número menor igual a: " + numMenor);
    }
}

