/*
 Funcionamiento del programa
 Consiste en que el jugador 1 introuce un valor de 'piedra, papel o tijeras' en consola, y ese valor lo lee en la variable s.
 Después es el turno del jugador 2 que puede introducir un valor de 'piedra, papel o tijeras' en consola, y ese valor lo lee 
 en la variable s2. Después entra en un ciclo if, primero con la condición que las cadenas j1 y j2 sean iguales, en caso de que
 si, es un empate y lo imprime en consola, y en caso de que no, pues declara una variable que es entero 'g' iniciando con '2'.
 Pasa 's1' por un switch case y conforme a cada caso evalua si 's2' (conforme a su valor) pierde contra 's1', y si es así el 
 valor de 'g' cambia a '1'. Tambien hay un caso por defecto si uno se equivoca escribiendo e imprime en consola que lo vuelva a
 intentar y cambia el valor de 'g' a '0'.  
 */
package com.generation;
import java.util.Scanner;
//importar la clase scanner

public class Ejercicio4 {
	//No es Codigo4

	public static void main( String[] args ) {
		//falto el public static void
		Scanner s = new Scanner(System.in);
		//Falto el Sistem.in dentro de Scanner
		Scanner s2 = new Scanner(System.in);
		//Posición correcta para declarar s2, no abajo de la solicitud para el jugador 2
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    //Es jugador 2 en vez de 1
	    String j2 = s2.nextLine();
	    
	    if (j1.equals(j2)) {
	    	//un parentesis de más en la condición
	    	//lo correcto para validar si dos cadenas son iguales es utilizar equals
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	          }
	          break;
	          //falto break pero se agregó
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          }
	          break;
	          //falto break pero se agregó
	        case "tijeras":
	        	//falto escribir una 's' al final
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	        	System.out.println("No coinciden los valores con el algoritmo, vuelve a ejecutar el programa");
	        	g = 0;
	        	break;
	        	//falto escribir en caso de que no coincidiera más un break
	      //} corchete en la posición erronea era para case "papel"
	      //System.out.println("Gana el jugador " + g); posición erronea, son puros cases
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	}
}

//faltaron 2 corchetes para cerrar