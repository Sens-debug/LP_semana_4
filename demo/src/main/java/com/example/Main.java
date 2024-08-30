// 1. Calculando la propina en un restaurante
// Enunciado:

// Estás en un restaurante colombiano con amigos y la cuenta ha llegado. ¡Es hora de calcular la propina!

// Paso a paso:

// Ingresa el valor de la cuenta:
// Solicita al usuario que ingrese el valor total de la cuenta, incluyendo el IVA, como un número decimal, por ejemplo: 120000.50.
// Guarda el valor de la cuenta en una variable llamada valorCuenta.
// Elige el porcentaje de propina:
// En Colombia, es común dejar una propina del 10% al 15% del valor de la cuenta.
// Solicita al usuario que ingrese el porcentaje de propina que desea dejar, por ejemplo: 12.
// Guarda el porcentaje de propina en una variable llamada porcentajePropina.
// Calcula el valor de la propina:
// Convierte el porcentaje de propina a un valor decimal dividiéndolo entre 100 (por ejemplo, 12 / 100 = 0.12).
// Multiplica el valor de la cuenta por el valor decimal del porcentaje de propina para obtener el valor de la propina.
// Guarda el valor de la propina en una variable llamada valorPropina.
// Calcula el valor total a pagar:
// Suma el valor de la cuenta y el valor de la propina para obtener el valor total a pagar.
// Guarda el valor total a pagar en una variable llamada valorTotal.
// Imprime el resultado:
// Muestra el valor de la cuenta, el porcentaje de propina, el valor de la propina y el valor total a pagar, formateados de manera clara y legible, por ejemplo:
// Valor de la cuenta: $120000.50
// Porcentaje de propina: 12%
// Valor de la propina: $14400.06
// Valor total a pagar: $134400.56

// Pista:

// Recuerda que en Java, las operaciones matemáticas se realizan con números decimales (tipo double).
// Puedes usar el método String.format() para dar formato a los números y mostrarlos con dos decimales, por ejemplo: String.format("%.2f", valorPropina).
// ¡Puedes usar la clase Math para redondear el valor de la propina al entero más cercano, si lo prefieres!


package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valorCuenta, valorPropina,valorTotal;
        int porcentajePropina;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la cuenta");
        valorCuenta = teclado.nextDouble();
        System.out.println("Ingrese el % de propina que quiera entregar");
        porcentajePropina = teclado.nextInt();
        valorPropina = (valorCuenta*porcentajePropina)/100;
        valorTotal=valorCuenta+valorPropina;
        teclado.close();
        String propinaFormat =String.format("%.2f", valorPropina);
        
        System.out.println("------------FACTURA-------------------");
        System.out.println("Valor de la cuenta sin propina --->"+ valorCuenta);
        System.out.println("Seleccionaste una propina del --->"+porcentajePropina+ "%");
        System.out.println("El valor de la propina es --->"+propinaFormat);
        System.out.println("El valor total a pagar es --->"+valorTotal);
       
    }

}