package com.corenetworks.presentacion;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numMayor=0;
        int numMenor=0;
        int contadrorNumMayor=0;
        int contadorNumMenor=0;
        int[]elementos={2,-4,-13,1,-3,15,1,9,6,-8,4,23,7,-13,23,15,-13,9,0};

         for (int i=0;i< elementos.length;i++){
             if (elementos [i]>numMayor){
                 numMayor=elementos[i];
                 contadorNumMenor++;
             }else if(
                 elementos[i]<numMenor){
                 numMenor=elementos[i];
                 contadrorNumMayor++;
             }

         }
        System.out.println("El numero mayor->  " + numMayor+" repite" +contadrorNumMayor+ "veces");
        System.out.println("El numero menor->  " + numMenor+" repite" +contadorNumMenor+ "veces");



    }
}
