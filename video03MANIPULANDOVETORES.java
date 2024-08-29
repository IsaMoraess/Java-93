import java.util.Scanner;

public class video03MANIPULANDOVETORES {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[5]; //float nota[5] = {0}
        float total = 0;
        float media = 0;
        System.out.println("Insira 5 notas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextFloat(); // Lê a próxima nota
            total += notas[i]; // Soma a nota ao total
        }
        media = total / 5; // Calcula a média das notas
        System.out.println("A média das notas é: " + media);
    }
}
