/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calificaciones;

import java.util.Scanner;


public class Calificaciones {
    Scanner entrada=new Scanner(System.in);
    static double promedio;

    /**
     *
     */
    public static int CDI,CE,I,P,TA,TS;
    
    
    
    public void Materias(){
        System.out.println("Dame las calificaciones obtenidas en la materia");
        System.out.print("Calculo Diferencial e Integral :");
        CDI=entrada.nextInt();
        System.out.print("Circuitos Electricos : ");
        CE=entrada.nextInt();
        System.out.print("Ingles : ");
        I=entrada.nextInt();
        System.out.print("Programación : ");
        P=entrada.nextInt();
        System.out.print("Teoría de Algorítmos : ");
        TA=entrada.nextInt();
        System.out.print("Teoría de Sistemas : ");
        TS=entrada.nextInt();
        promedio= ((CDI+CE+I+P+TA+TS)/6);
        System.out.println("\" El promedio obtenido es de "+promedio);
    }
    
    public static void main(String[] args) {
        
        Calificaciones cali=new Calificaciones();
        cali.Materias();
        
    }
}
