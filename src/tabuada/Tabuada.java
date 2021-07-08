package tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        int contador = 1;
        int tabuada;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a tabuada desejada: ");
        tabuada = teclado.nextInt();

        while (contador <= 10) {
            System.out.println(tabuada + "x" + contador + "=" + contador * tabuada);
            contador++;
        }
    }
}

    
