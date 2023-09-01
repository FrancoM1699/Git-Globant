/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7Enc2939Ejer15;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Guía7Enc2939Ejer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        /*
        
        //EJERCICIO 1
        //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma.
        
        int num1;
        int num2;
        
        System.out.println("Ingrese un número entero");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese otro número entero");
        num2 = leer.nextInt();
        
        int suma;
        suma = num1 + num2;
        
        System.out.println(suma); 
        
        //EJERCICIO 2
        //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Su nombre es " + nombre);
        
        //EJERCICIO 3
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase()); 
        
        //EJERCICIO 4
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        System.out.println("Ingrese una cantidad de grados centígrados");
        double grados = leer.nextDouble();
        
        double faren = 32 + (9 * grados / 5);
        
        System.out.println("La conversión de " + grados + " a farenheit es: " + faren); 
        
        //EJERCICIO 5
        //Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
        //Nota: investigar la función Math.sqrt().
        
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        
        System.out.println("El doble del número ingresado es " + num * 2);
        System.out.println("El triple del número ingresado es " + num * 3);
        System.out.println("La raíz cuadrada del número ingresado es " + Math.sqrt(num));
        
        //CONDICIONALES
        
        //EJERCICIO 6
        //Crear un programa que dado un numero determine si es par o impar.
        
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
        //EJERCICIO 7
        //Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
        //Nota: investigar la función equals() en Java.
        
        String palabraClave = "eureka";
        
        System.out.println("Ingrese una frase");
        String palabra = leer.nextLine();
        
        if (palabra.equals(palabraClave)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        //EJERCICIO 8
        //Realizar un programa que solo permita introducir frases o palabras de 8 caracteres de largo. Si
        //el usuario ingresa una frase o palabra de 8 caracteres de largo se deberá de imprimir un mensaje
        //por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
        //“INCORRECTO”. Nota: investigar la función Lenght() en Java.
        
        System.out.println("Ingrese una palabra de 8 caracteres de largo");
        String palabra = leer.nextLine();
        
        if (palabra.length()==8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
        //EJERCICIO 9
        //Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
        //es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
        //que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
        //investigar la función Substring y equals() de Java.
        
        System.out.println("Ingrese una palabra que empiece con la letra A");
        String palabra = leer.nextLine();
        
        String letra = palabra.substring(0,1);
        
        if (letra.equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
        //BUCLES Y SENTENCIAS DE SALTO, BREAK Y CONTINUE
        
        //EJERCICIO 10
        //Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
        //solicite números al usuario hasta que la suma de los números introducidos supere el
        //límite inicial.
        
        System.out.println("Ingrese un valor límite positivo:");
        int limite = leer.nextInt();
        
        if (limite <= 0) {
            System.out.println("El valor límite debe ser positivo.");
            return; // Salir del programa si el límite no es positivo
        }

        int suma = 0;
        int contador = 0;

        while (suma <= limite) {
            System.out.println("Ingrese un número:");
            int numero = leer.nextInt();
            
            suma += numero;
            contador++;
        }

        System.out.println("La suma de los números introducidos superó el límite.");
        System.out.println("Se ingresaron un total de " + contador + " números.");
        System.out.println("La suma total es: " + suma);
        
        */
        
        //EJERCICIO 11
        //Realizar un programa que pida dos números enteros positivos por teclado y muestre por
        //pantalla el siguiente menú:
        
        //MENU
        //1. Sumar
        //2. Restar
        //3. Multiplicar
        //4. Dividir
        //5. Salir
                
        //Elija opción:
        //El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
        //pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        //opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
        //programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
        //seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
        //del programa, caso contrario se vuelve a mostrar el menú.
        
        System.out.println("Ingrese 2 números enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 < 0 || num2 < 0) {
            System.out.println("Ambos números deben ser positivos");
            return;
        }
        
        String respuesta = "N";
        
        do {
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Elija una opción");
            int opcion = leer.nextInt();
            
            leer.nextLine();
            
            switch (opcion) {
            case 1:
                int suma = num1 + num2;
                System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
                break;
            case 2:
                int resta = num1 - num2;
                System.out.println("La resta entre " + num1 + " y " + num2 + " es: " + resta);
                break;
            case 3:
                int multi = num1 * num2;
                System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es: " + multi);
                break;
            case 4:
                int div = num1 / num2;
                System.out.println("La división entre " + num1 + " y " + num2 + " es: " + div);
                break;
            case 5:
                System.out.println("Está seguro de que desea salir? (S/N)");
                respuesta = leer.next();
            }
        } while (respuesta.equalsIgnoreCase("N"));
        
        //EJERCICIO 12
        //Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
        //dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
        //fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
        //ser X y el último tiene que ser una O.
        
        //Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
        //especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
        //distinta de FDE, que no respete el formato se considera incorrecta.
        
        //Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
        //e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
        //siguientes funciones de Java Substring(), Length(), equals().
        
        System.out.println("Ingrese una cadena de un máximo de 5 caracteres de largo que comience con X y termine con O.");
        String cadena = leer.nextLine();
        
        
        
    }
}
