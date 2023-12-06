public class Entrada {

    public static void main(String[] args) {

        //Este es el bingo

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*98)+1;
            

        }
    }
}
