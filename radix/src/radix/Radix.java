
package radix;

import java.util.Random;

public class Radix {

    public static void aleatorio(int vetor[]) {
        Random aleat = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleat.nextInt(200);
        }
    }

    public static String imprimir(int vetor[]) {
        String saida = "";
        for (int i = 0; i < vetor.length; i++) {
            saida += vetor[i] + " ";
        }
        return saida;
    }

    public static void inicializador(Fila vetor[]) {
        for (int i = 0; i < 10; i++) {
            vetor[i] = new Fila();
        }
    }

    public static void dequeue(int vetorNumero[], Fila vetor[]) {
        int i = 0, j = 0;
        while (i < 10) {
            if (vetor[i].isEmpty()) {
                i++;
            } else {
                vetorNumero[j] = vetor[i].dequeue();
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int vetor[] = new int[20];
        aleatorio(vetor);
        System.out.println(imprimir(vetor));
        Fila vetor2[] = new Fila[10];
        inicializador(vetor2);
        
        //1° Base
        for (int i = 0; i < vetor.length; i++) {
            int valor = vetor[i] % 10;
            vetor2[valor].enqueue(vetor[i]);
        }
        dequeue(vetor, vetor2);

        //2° Base
        for (int i = 0; i < vetor.length; i++) {
            int valor = (vetor[i] % 100) / 10;
            vetor2[valor].enqueue(vetor[i]);
        }
        dequeue(vetor, vetor2);

        //3° Base
        for (int i = 0; i < vetor.length; i++) {
            int valor = vetor[i] / 100;
            vetor2[valor].enqueue(vetor[i]);
        }
        dequeue(vetor, vetor2);

        System.out.println(imprimir(vetor));

    }

}
