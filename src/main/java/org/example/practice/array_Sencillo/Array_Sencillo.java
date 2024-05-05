package org.example.practice.array_Sencillo;

import java.util.Arrays;

public class Array_Sencillo {

    /*En esta clase vamos a encontrar lo basico para entender el como recorrer un arreglo
     con un For,las diferentes maneras de hacerlo y como abordar los ejercicios que ya
    /* tiene un parametro especificado

     Consejo : recuerda que la algoritmia es importante, pero recuerda que si no pasas
     las pruebas tecnicas o si tu codigo no compila debes de esforzarte un poco mas pero no
     significa que tus habilidades no sean valoradas !!Animo

     1. Identificar la estructura del ejercicio

      Problema de ejemplo basico :

      Tienes un arreglo  de  10 posiciones  que tienen los numeros del 1 al 10, realiza la impresion
      del arreglo que sea de dos en dos y adicional otra impresion que sea de atras hacia adelante.

      Pensamiento Logico:
      1.Identificar que el arreglo es de 10 posiciones y tiene alamacenado los numeros del  1 al 10.
      2.Identificar que estructura necesecito para reccorer el arreglo de forma que me genere los
      saltos de dos en dos y de manera inversa para esto  utilizamos un ciclo for( si no entiendes que es un ciclo for
      ingresa al siguiente video https://www.youtube.com/watch?v=V7U96RG6MPE

      3. imprimir el ejercicio
      */

     // 1. ejemplo con sin parametro en el objecto  que significa que son de tipo void


     public void array() {
          // declarar el arreglo y asiganarle las posiciones

          Integer array[] = new Integer[11];
          // indico el ciclo for  asigno de donde a donde  va  i<=10 para que recorra las 10 posiciones
          for (int i = 0; i <= 10; i++) {
               // asigno el numero de las posiciones en el arreglo para que me muestre en que posicion esta
               array[i] = i;
               // imprimo la salida con la posicion
               System.out.println("Posicion" + array[i] + " = " + i);
          }
    // como pueden ver en este ejercicio se esta recorriendo los numeros del  1 al  10 sin los saltos de dos en dos es decir que
          //no cumple con los parametros pero lo vamos a tomar de ejemplo para saber como recorrer un arreglo
     }

     // en este caso el ejecricio nos inidca que en el metodo necesitamos recorrer una variable de tipo arreglo
     // entonces debemos identificar que el arreglo ya esta en el ejercicio nos especifica que el retorno debe ser como un
     //arreglo


     public int[] Array(int array[]) {
          int[] newArray = new int[10]; // Creamos un nuevo arreglo para almacenar los primeros 10 números
          // despues de ello  asignamos de donde adone lo va recorrer asignadole la cantidad y tambien el recorrido del arreglo
          // && significa and o y en español, el .lengt es para que recorra  todas las posiciones del arreglo
          for (int i = 0; i < 10 && i < array.length; i+=2) // aqui en esta parte es donde asignamos el incremento de cuanto en cuanto va a se
               // de 2 en 2
                {
               newArray[i] = i + 1; // Asignamos los valores del 1 al 10 al nuevo arreglo
               // imprimimos -->opcional esta parte para ello ya existe el retrono
               System.out.println("Posicion " + newArray[i] + " = " + i);
          }
          // la confusion siempre es en esta parte que debo retornar se debe retornar la solucion es decir el objecto que en este
         // caso contiene los numeros del arreglo
          return newArray; // Devolvemos el nuevo arreglo
     }

     // Ahora nos indican que debemos  regresar ese mismo  arreglo  es decir de atras hacia adelante
     public int[] ArrayReverse(int array[]) {
          int[] newArray = new int[10]; // Creamos un nuevo arreglo para almacenar los primeros 10 números
          // despues de ello  asignamos de donde adone lo va recorrer asignadole la cantidad y tambien el recorrido del arreglo
          // ene ste caso como es de manera inversa aisgnamos a (i) todo el arrrglo  y ese -1 es para que empiece desde la ultima posicion
          //-1  es el (10)  y hasta que posiicon  i >=0 es el  (1) y el i =-2 es para que regrese de 2 en 2 es decir  10 8 6..

          for (int i = array.length -1 ; i >=0 ;i-=2)
          {
               newArray[i] = i + 1; // Asignamos los valores del 1 al 10 al nuevo arreglo
               // imprimimos -->opcional esta parte para ello ya existe el retrono
               System.out.println("Posicion " + newArray[i] + " = " + i);
          }
          // la confusion siempre es en esta parte que debo retornar se debe retornar la solucion es decir el objecto que en este
          // caso contiene los numeros del arreglo
          return newArray; // Devolvemos el nuevo arreglo
     }

     //ahora una forma sencilla de recorre un arreglo si slo te permiten hacer pocas modificaciones





}
