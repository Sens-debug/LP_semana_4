

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 // EJERCICIO 1

//// 1. Calculando la propina en un restaurante
// // Enunciado:

// // Estás en un restaurante colombiano con amigos y la cuenta ha llegado. ¡Es hora de calcular la propina!

// // Paso a paso:

// // Ingresa el valor de la cuenta:
// // Solicita al usuario que ingrese el valor total de la cuenta, incluyendo el IVA, como un número decimal, por ejemplo: 120000.50.
// // Guarda el valor de la cuenta en una variable llamada valorCuenta.
// // Elige el porcentaje de propina:
// // En Colombia, es común dejar una propina del 10% al 15% del valor de la cuenta.
// // Solicita al usuario que ingrese el porcentaje de propina que desea dejar, por ejemplo: 12.
// // Guarda el porcentaje de propina en una variable llamada porcentajePropina.
// // Calcula el valor de la propina:
// // Convierte el porcentaje de propina a un valor decimal dividiéndolo entre 100 (por ejemplo, 12 / 100 = 0.12).
// // Multiplica el valor de la cuenta por el valor decimal del porcentaje de propina para obtener el valor de la propina.
// // Guarda el valor de la propina en una variable llamada valorPropina.
// // Calcula el valor total a pagar:
// // Suma el valor de la cuenta y el valor de la propina para obtener el valor total a pagar.
// // Guarda el valor total a pagar en una variable llamada valorTotal.
// // Imprime el resultado:
// // Muestra el valor de la cuenta, el porcentaje de propina, el valor de la propina y el valor total a pagar, formateados de manera clara y legible, por ejemplo:
// // Valor de la cuenta: $120000.50
// // Porcentaje de propina: 12%
// // Valor de la propina: $14400.06
// // Valor total a pagar: $134400.56

// // Pista:

// // Recuerda que en Java, las operaciones matemáticas se realizan con números decimales (tipo double).
// // Puedes usar el método String.format() para dar formato a los números y mostrarlos con dos decimales, por ejemplo: String.format("%.2f", valorPropina).
// // ¡Puedes usar la clase Math para redondear el valor de la propina al entero más cercano, si lo prefieres!




//         double valorCuenta, valorPropina,valorTotal;
//         int porcentajePropina;

//         Scanner teclado = new Scanner(System.in);
//         System.out.println("Ingrese el valor de la cuenta");
//         valorCuenta = teclado.nextDouble();
//         System.out.println("Ingrese el % de propina que quiera entregar");
//         porcentajePropina = teclado.nextInt();
//         valorPropina = (valorCuenta*porcentajePropina)/100;
//         valorTotal=valorCuenta+valorPropina;
//         teclado.close();
//         String propinaFormat =String.format("%.2f", valorPropina);
        
//         System.out.println("------------FACTURA-------------------");
//         System.out.println("Valor de la cuenta sin propina --->"+ valorCuenta);
//         System.out.println("Seleccionaste una propina del --->"+porcentajePropina+ "%");
//         System.out.println("El valor de la propina es --->"+propinaFormat);
//         System.out.println("El valor total a pagar es --->"+valorTotal);



//--------------------------------------
// //EJERCICIO 2
// 2. Calculando el precio de un taxi en Medellín
// Enunciado:

// Estás en Medellín y necesitas tomar un taxi para llegar a tu destino. Para calcular el precio del viaje, necesitas considerar la tarifa base, el valor por kilómetro recorrido y el tiempo de espera en tráfico.

// Paso a paso:

// Ingresa la distancia del viaje:
// Solicita al usuario que ingrese la distancia del viaje en kilómetros, por ejemplo: 8.2.
// Guarda la distancia en una variable llamada distancia.
// Ingresa el tiempo de espera en tráfico:
// Solicita al usuario que ingrese el tiempo que espera pasar en tráfico, en minutos, por ejemplo: 10.
// Guarda el tiempo de espera en una variable llamada tiempoEspera.
// Calcula el precio del viaje:
// Define la tarifa base del taxi en Medellín (por ejemplo, $4.000). Guarda este valor en una variable llamada tarifaBase.
// Define el valor por kilómetro recorrido (por ejemplo, $900). Guarda este valor en una variable llamada valorKilometro.
// Define el valor por minuto de espera en tráfico (por ejemplo, $150). Guarda este valor en una variable llamada valorMinuto.
// Calcula el precio total del viaje:
// Multiplica la distancia por el valor por kilómetro recorrido.
// Multiplica el tiempo de espera por el valor por minuto.
// Suma la tarifa base, el precio por distancia y el precio por tiempo de espera.
// Guarda el precio total del viaje en una variable llamada precioTotal.
// Imprime el resultado:
// Muestra el precio total del viaje, formateado de manera clara y legible, por ejemplo:
// Precio del viaje: $11.580

// Pista:

// Puedes usar variables con nombres descriptivos para almacenar la información del viaje, por ejemplo: distancia, tiempoEspera, tarifaBase, valorKilometro, valorMinuto, precioTotal.
// Recuerda que en Java, las operaciones matemáticas se realizan con números decimales (tipo double).
// Puedes usar el método String.format() para dar formato al precio total y mostrar el valor con dos decimales, por ejemplo: String.format("%.2f", precioTotal).

        // final int tarifaBase,valorMinuto,valorKilometro;
        // double distancia,precioTotal,tiempoEspera;
        // tarifaBase = 4000;
        // valorKilometro = 900;
        // valorMinuto = 150;
        // Scanner teclado = new Scanner(System.in);
        // System.out.println("Ingrese la distancia que planea recorrer(en km)");
        // distancia = teclado.nextDouble();
        // System.out.println("ingrese un tiempo de espera en trafico(en minutos)");
        // tiempoEspera = teclado.nextDouble();
        // teclado.close();
        // distancia = valorKilometro*distancia;   //Precio distancia
        // double tiempo = tiempoEspera*valorMinuto;  //Precio tiempo espera 
        // precioTotal = tarifaBase+distancia+tiempo;
        // System.out.println("------TICKET-----------");
        // System.out.println("Tarifa Base ---> "+tarifaBase);
        // System.out.println("Valor por distancia recorrida ---> "+distancia);
        // System.out.println("Valor por tiempo de espera ---> "+ tiempo);
        // System.out.println("Precio total del viaje ---> "+precioTotal);


        ///EJERCICIO 3

//3. Decodificando un mensaje secreto
// Enunciado:

// Eres un agente secreto que ha recibido un mensaje codificado. Para descifrarlo, necesitas aplicar una serie de operaciones sobre las cadenas de texto.

// Mensaje codificado:

// "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0"

// Paso a paso:

// Convierte los números a letras:
// Reemplaza los números "0" por la letra "o", los números "3" por la letra "e" y los números "4" por la letra "a".
// Puedes usar el método replace() para realizar estas sustituciones.
// Elimina los espacios en blanco adicionales:
// Elimina los espacios en blanco al principio y al final de la cadena, y también los espacios en blanco adicionales que se encuentran entre las palabras.
// Puedes usar el método trim() para eliminar los espacios al principio y al final, y el método replaceAll() para eliminar los espacios en blanco adicionales.
// Convierte la cadena a mayúsculas:
// Convierte toda la cadena a mayúsculas.
// Puedes usar el método toUpperCase().
// Imprime el mensaje decodificado:
// Muestra el mensaje decodificado en la consola, con el texto completamente legible.
// Pista:

// Puedes usar una variable llamada mensajeCodificado para almacenar el mensaje inicial.
// Puedes usar una variable llamada mensajeDecodificado para almacenar el mensaje decodificado después de cada paso.
// Puedes usar el método System.out.println() para imprimir el mensaje decodificado en la consola.
        
        //     String mensajeDecodificado,mensajeDecodificado_a,mensajeDecodificado_b,mensajeDecodificado_c,mensajeDecodificado_d,mensajeDecodificado_e,mensajeDecodificado_h;

        // String mensaje_codificado = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";

        // mensajeDecodificado = mensaje_codificado.replace("4", "a");
        // mensajeDecodificado_a = mensajeDecodificado.replace("0", "o");
        // mensajeDecodificado_b= mensajeDecodificado_a.replace("U", "u");
        // mensajeDecodificado_c = mensajeDecodificado_b.replace("3", "e");
        // mensajeDecodificado_d = mensajeDecodificado_c.replace("D", "d");
        // mensajeDecodificado_e = mensajeDecodificado_d.replace("M", "m");
        // mensajeDecodificado_h = mensajeDecodificado_e.replace("D", "d");

        // System.out.println(mensajeDecodificado_h);

    }

}