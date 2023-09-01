/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIntroEjersTeoria15;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class JavaIntroEjersTeoria15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        /*
        
        //EJERCICIO 1 Y 2
        //Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.
        //Luego deberás asignarles un valor a las variables.
        
        String cadena = "Franco";
        double decimales = 3.55;
        char caracter = 'a';
        int entero = 35;
        long enteroGrande = 355;
        boolean booleano = false;
        System.out.println(cadena);
        System.out.println(decimales);
        System.out.println(caracter);
        System.out.println(entero);
        System.out.println(enteroGrande);
        System.out.println(booleano);
        
        //EJERCICIO 3
        //Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
        
        int num1 = 10;
        int num2 = 5;
        int suma = num1 + num2;
        int resta = num1 - num2;
        System.out.println(num1 + num2);
        System.out.println(suma);
        System.out.println(num1 - num2);
        System.out.println(resta);
        
        int sumaANum1 = num1++;
        int restaANum1 = num1--;
        System.out.println(num1++);
        System.out.println(sumaANum1);
        System.out.println(num1--);
        System.out.println(restaANum1);
        
        boolean igualdadNums = num1 == num2;
        boolean desigualdadNums = num1 != num2;
        System.out.println(num1 == num2);
        System.out.println(igualdadNums);
        System.out.println(num1 != num2);
        System.out.println(desigualdadNums); 
        
        //EJERCICIO 4
        //Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables
        //por pantalla.
        
        String nombre = "Franco";
        int edad = 24;
        System.out.println(nombre + " " + edad);
        
        //EJERCICIO 5
        //Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
        //Scanner.
        
        System.out.println("Ingrese true o false");
        boolean buleanoLeer = leer.nextBoolean();
        System.out.println(buleanoLeer);
        
        System.out.println("Ingrese un número real");
        double realLeer = leer.nextDouble();
        System.out.println(realLeer);
        
        System.out.println("Ingrese un caracter");
        char caracterLeer = leer.next().charAt(0);
        System.out.println(caracterLeer); 
        
        //CONDICIONALES
        
        //EJERCICIO 6
        //Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
        //alguno de ellos es mayor a 25.
        
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();
        
        if (num1 >= 25 && num2 >= 25) {
            System.out.println("Ambos números son iguales o mayores a 25");
        } else {
            System.out.println("Uno de los números es menor a 25");
        }
        
        //EJERCICIO 7
        //Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
        //que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor
        //y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
        
        //-Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de
        //agua”.
        //-Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
        //gasolina”.
        //-Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
        //hormigón”.
        //-Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de
        //pasta alimenticia”.
        //-Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
        //válido para tipo de bomba”
        
        System.out.println("Ingrese un número del 1 al 4 para especificar el tipo de motor");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe una valor válido para tipo de bomba");
        }
        
        //ESTRUCTURAS REPETITIVAS
        
        //EJERCICIO 8
        //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
        //pedirá de nuevo hasta que la nota sea correcta.
        
        int nota = -1;
        
        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese una nota que esté comprendida entre 0 y 10");
            nota = leer.nextInt();
        }
        System.out.println("La nota ingresada es: " + nota);
        
        //EJERCICIO 9
        //Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
        //bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
        //el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
        //Nota: recordar el uso de la sentencia break.
        
        int suma = 0;
        int contador = 0;
        int nro;
        
        do {
            System.out.println("Ingrese un número");
            nro = leer.nextInt();
            
            if (nro == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            }
            
            if (nro > 0) {
                suma = suma + nro;
                contador = contador + 1;
            }
        } while (contador < 20);
        
        System.out.println("La suma de todos los números ingresados es " + suma);
        
        //EJERCICIO 10
        //Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
        //ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        //5 *****
        //3 ***
        //11 ***********
        //2 **
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un número");
            int nro = leer.nextInt();
            
            if (nro >= 1 && nro <= 20) {
                System.out.print(nro + " ");
                for (int j = 0; j <= nro; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                System.out.println("Número fuera del rango permitido.");
                i--;
            }
        }
        
        */
    }
}
