public class video01VETOR {
    public static void main(String[] args) throws Exception {
        int[] nota = new int[10];

        nota[0] = 10; // vetor smp inicia cm 0 quando declarado
        nota[1] = 5;
        nota[2] = 4;
        nota[3] = 2;
        nota[4] = 7;

        // Você pode imprimir os valores do array para verificar se estão corretos
        for (int i = 0; i < 5; i++) {
            System.out.println(nota[i]);
        }
    }
}
