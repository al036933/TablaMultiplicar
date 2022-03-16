package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int numero = 0, resultado, j;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Qúe tabla de multiplicar quiere repasar? La tabla del: ");
        numero = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            resultado = i * numero;
            System.out.println(i + " x " + numero + " = " + resultado);
        }

        System.out.println();
        System.out.println();

        j = 0;
        while (j <= 10) {
            resultado = j * numero;
            System.out.println(j + " x " + numero + " = " + resultado);

            j++;
        }

        entrada.close();
    }
}
