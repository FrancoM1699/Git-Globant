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
        
        System.out.println("Ingrese una cadena de 5 caracteres de largo que comience con X y termine con O.");
        
        int correctas = 0;
        int incorrectas = 0;
        String FDE = "&&&&&";
        
        while (true) {
            String cadena = leer.nextLine();
            
            if (cadena.equals(FDE)) {
                System.out.println("Ingreso la secuencia especial");
                break;
            }
            
            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                System.out.println("Ha ingresado una cadena válida");
                correctas ++;
            } else {
                System.out.println("Ha ingresado una cadena incorrecta");
                incorrectas ++;
            }
        }
        
        System.out.println("Cantidad de lecturas correctas: " + correctas);
        System.out.println("Cantidad de lecturas incorrectas: " + incorrectas);
        
        //EJERCICIO 13
        
        //Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        //cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        //* * * *
        //*     *
        //*     *
        //* * * *
        
        System.out.println("Ingrese la cantidad de elementos base por lado que tendrá el cuadrado");
        int cantidad = leer.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                if (i == 0 || i == cantidad - 1 || j == 0 || j == cantidad - 1) {
                    System.out.print("* "); // Checkea si estamos en alguno de los bordes del cuadrado
                } else {
                    System.out.print("  "); // Espacio en blanco para el interior del cuadrado
                }
            }
            System.out.println(); // Nueva línea al final de cada fila
        }
        
        //EJERCICIO 14
        
        //Crea una aplicación que a través de una función nos convierta una cantidad de euros
        //introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        //función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
        //una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        //(void).
        
        //El cambio de divisas es:
        //* 0.86 libras es un 1 €
        //* 1.28611 $ es un 1 €
        //* 129.852 yenes es un 1 €
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        int euros = leer.nextInt();
        
        System.out.println("y la moneda a la que desea convertir (dolares, yenes o libras)");
        String moneda = leer.next();
        
        convertir(euros,moneda);
        
        //EJERCICIO 15
        
        //Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
        //muestre por pantalla en orden descendente.
        
        int[] naturales = new int[100];
        
        for (int i = 0; i < 100; i++) {
            naturales[i] = i + 1;
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.println("[" + naturales[i] + "]");
        }
    }
        
        //EJERCICIO 16
        
        //Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
        //al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        //numero y si se encuentra repetido.
        
        System.out.println("Ingrese el tamaño del vector a rellenar con valores aleatorios");
        int tamanio = leer.nextInt();
        int[] vector = new int[tamanio];
        
        System.out.println("Ingrese el número que desea buscar dentro del arreglo");
        int buscado = leer.nextInt();
        
        boolean encontrado = false;
        int repetido = 0;
        int posicion = 0;
        
        for (int i = 0; i < tamanio; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        
        for (int i = 0; i < tamanio; i++) {
            if (vector[i] == buscado) {
                encontrado = true;
                repetido ++;
                posicion = i;
            }
        }
    
        if (encontrado) {
            System.out.print("El número buscado se encontró por primera vez en la posición " + posicion + " del vector ");
            if (repetido > 1) {
                System.out.println("y está repetido " + repetido + " veces.");
            }
        } else {
            System.out.println("El número buscado no se encuentra en el vector");
        }
        
        //EJERCICIO 17  
        
        //Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        //de 2 dígitos, etcétera (hasta 5 dígitos).
    
        System.out.println("Ingrese el tamaño del vector a rellenar");
        int tamanio = leer.nextInt();
        int[] vector = new int[tamanio];
        
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            vector[i] = leer.nextInt();
        }
        
        // Inicializamos contadores para cada cantidad de dígitos
        int[] contadores = new int[6]; // Índices 0 a 5 representan 0 a 5 dígitos
        
        for (int i = 0; i < tamanio; i++) {
            int numero = Math.abs(vector[i]); //Sacamos el valor absoluto en caso de haber números negativos
            int digitos = contarDigitos(numero); //Contamos la cantidad de dígitos
            
            if (digitos <= 5) {
                contadores[digitos]++; //Si la cantidad de dígitos es menor o igual a 5, sumamos 1 al valor que representa esa cantidad
            }
        }
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Números con " + i + " dígitos: " + contadores[i]);
        }
        
        //EJERCICIO 18
        
        //Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
        //traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
        //obtiene cambiando sus filas por columnas (o viceversa).
        
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10); //Rellenamos la matriz con números aleatorios
            }
        }
        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        int[][] traspuesta = new int [4][4]; //Creamos la matriz traspuesta
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta[i][j] = matriz[j][i]; //Almacenamos los valores en la matriz traspuesta, inviertiendo las columnas y las filas
            }
        }
        
        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + traspuesta[i][j] + "]");
            }
            System.out.println();
        }
        
        //EJERCICIO 19
        
        //Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
        //una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
        //de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        //denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
        
        int[][] matriz = {
            {0, -2, 3},
            {2, 0, 4},
            {-3, -4, 0}
        };

        // Verificar si la matriz es antisimétrica
        boolean esAntisimetrica = esAntisimetrica(matriz);

        // Mostrar el resultado
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    
        */
        
        //EJERCICIO 20
        
        //Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        //suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        //permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        //El programa deberá comprobar que los números introducidos son correctos, es decir,
        //están entre el 1 y el 9.
        
        
        
        /*
        
        //EJERCICIO 20 EXTRA
        
        //Crear una función que rellene un vector con números aleatorios, pasándole un arreglo por
        //parámetro. Después haremos otra función o procedimiento que imprima el vector.
        
        System.out.println("Ingrese el tamaño del vector");
        int tamanio = leer.nextInt();
        int[] vector = new int[tamanio];
        
        rellenar(vector, tamanio);
        mostrarVector(vector, tamanio);
    }
        /*
    
    //PROCEDIMIENTO EJERCICIO 14
    
    public static void convertir (int euros, String moneda) {
        
        if (moneda.equalsIgnoreCase("dolares")) {
            System.out.println(euros + " euros equivalen a " + euros * 1.28611 + " dolares.");
        } else if (moneda.equalsIgnoreCase("yenes")) {
            System.out.println(euros + " euros equivalen a " + euros * 129.852 + " yenes.");
        } else {
            System.out.println(euros + " euros equivalen a " + euros * 0.86 + " libras.");
        }
    }
        
    //FUNCIÓN EJERCICIO 17
    
    public static int contarDigitos (int numero) {
        if (numero == 0) {
            return 1; // El número 0 tiene un dígito
        }

        int contador = 0;
        while (numero != 0) {
            numero /= 10; // Divide sucesivamente por 10 para contar los dígitos
            contador++;
        }
        return contador;
    }
    
    //FUNCION EJERCICIO 19
    
    public static boolean esAntisimetrica(int[][] matriz) {
        int filas = matriz.length; //Almacenamos la cantidad de filas que tiene la matriz
        int columnas = matriz[0].length; //Almacenamos la cantidad de items por fila, lo que equivale al número de columnas

        // Verificar si la matriz es cuadrada (misma cantidad de filas y columnas)
        if (filas != columnas) {
            return false;
        }

        // Verificar si la matriz es antisimétrica
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
    
    */
    
    /*
    
    //FUNCION EJERCICIO 20 EXTRA
    
    public static int[] rellenar (int[] vector, int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        return vector;
    }
    
    //PROCEDIMIENTO EJERCICIO 20 EXTRA
    
    public static void mostrarVector (int[] vector, int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
    */
    }
}