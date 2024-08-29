public class video02DECLARAVETORES {
    public static void main(String[] args) throws Exception {
        //so falei qnts bloco o vetor tem, ñ atibuir valor
        int[] vetor = new int[5];

    for (int i = 0; i < 5; ++i){
        //pra n fica o resultado = a 0 colocamos i + 1 vai somando de 1 em 1 ate 5
        vetor[i] = i + 1;
        System.out.println(vetor[i]);
    }
    }
}
