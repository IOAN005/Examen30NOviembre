package com.corenetworks.presentacion;

public class Ejercicio5 {
    public static void main(String[] args) {
        String texto="Nunca mates una mosca sobre la cabeza de un tigre";
        //1.Mayusculas
        System.out.println(texto.toUpperCase());
        //2.Minusculas
        System.out.println(texto.toLowerCase());
        //3.Palabra "sobre"
        System.out.println(texto.substring(22,27));
        //4.Posicion letra "m"
        System.out.println(texto.substring(6,7));
        //.5Longitud
        System.out.println(texto.length());
    }
}
