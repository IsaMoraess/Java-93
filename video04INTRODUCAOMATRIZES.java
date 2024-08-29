public class video04INTRODUCAOMATRIZES {
    public static void main(String[] args) throws Exception {
        //os dois [] representa matriz prime.LINHA, segun.COLUNA
        int[][] matriz = new int[3][3]; //MATTRIZ BIDIMENCIONAL
        //matriz[linha][coluna]
        matriz[0][0] = 1;
        matriz[0][1] = 8;
        matriz[0][2] = 47;
        matriz[1][0] = 10;
        matriz[1][1] = 55;
        matriz[1][2] = 32;
        matriz[2][0] = 7;
        matriz[2][1] = 99;
        matriz[2][2] = 78;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    } 
}