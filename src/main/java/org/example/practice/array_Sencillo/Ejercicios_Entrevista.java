package org.example.practice.array_Sencillo;

import java.util.Scanner;

public class Ejercicios_Entrevista {

    // en esta clase vamos hacer dos ejercios de entrevistas muy comunes con su explicacion
    //1.Numeros primos
    //2.Asignacion de casillas tablero de ajedrez


    //1. que es un numero primo
    //Los números primos son aquellos que solo son divisibles por ellos mismos  2/2 ,3/3 ,5/5
    // que le estan pidieendo generar una division del numero que su reciduo sea 1

    //los ejercicios por lo general dicen inidqueme si un numero es primo o no e imprimalo

    // para ello vamos a necesitar dos arreglos 1 para signar el numero y otro para generar la division con el mismo numero
    //adicional a ello vamos a utilizar % para que nos indiique el residuo
    public int primos(Boolean primos) {
        // en el primer ciclo vamos a definir el tamaño hasta donde se va contar en este caso es hasta  100
        // y asignaremos una varable booleana para identificar si es verdadero o falso

        int contador=0; // definimos un contador para que acumule los numeros primos
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {  // aqui vamos hacer la asignacion del numero que esta en i y lo vamos a dividir con j
                // entonces i=1 / j =1 = no es primo
                if (i % j == 0) {
                    esPrimo = false; // no es divisible
                    break; // para cerrar el ciclo
                }

            }
            /// como ya tenemos la division necesitamos un condicional que nos indique si es primo o  no
            // con el booelano que habiamos definido como primera instancia
            if (primos && esPrimo) {
                System.out.println(i + " es un número primo.");
                contador++;// el incremento de cada numero primo
            } else if (!primos && !esPrimo) {
                System.out.println(i + " no es primo");
            }


        }
        return contador;// la impresion de los numeros primos
    }


    //2. aignar  A y B en un tablero de ajedrez el tamaño es de  8 por 8 y que haga el conteo total de las casillas
   //  - identificar que son dos arreglos dieferentes uno donde asignar A y otro donde asignar B
    public String[] Ajedrez(int[][] tablero){

        tablero= new int[8][8];// asignamos las 8 filas y las  8 columnas
  /// declaramos dos ciclos for para asignar las posiciones
        for(int i =0; i<tablero.length;i++){
            for (int j=0; j<tablero[i].length;j++){
                 if((i+j) % 2 ==0){ // aqui estamos haciendo la division para asignar A y B entonces para explciar si la suma
                                      // es igual a 0 significa que la casilla es par y esta asignado A  pero si es diferente de par
                     tablero[i][j] ='A';  // es impar y esta asignado B   en la casilla siguiente

                 }else {
                     tablero[i][j] ='B';
                 }
            }



        }
        // como nos indica la firma del metodo debe regresarse en un arreglo de tipo String
        String[] imprimirtablero = new String[64]; // asignamos el tamaño total del tablero de ajedrez que es de  8X8
        for (int i = 0; i < tablero.length; i++) { // aqui estamos rrecorriendo el arreglo que ya le asignamos las letras utilizando el String valueof para indicar que el caracter que va recibir es de tipo char o cadena
            for (int j = 0; j < tablero[i].length; j++) {
                imprimirtablero[i * 8 + j] = String.valueOf((char)tablero[i][j]);
            }
        }


        return imprimirtablero; // retornado como nos pide la firma un string tipo array
    }


}



