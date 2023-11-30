package com.corenetworks.modelo;

import java.util.Random;

public class Dado {
    private Random aleatorio;
    public   String dibujarNumero(){
        String numero="";
        switch (numero) {
            case "uno":
                System.out.println(1);
                break;
            case "dos":
                System.out.println(2);
                break;
            case "tres":
                System.out.println(3);
                break;
            case "cuatro":
                System.out.println(4);
                break;
            case "cinco":
                System.out.println(5);
                break;
            case "seis":
                System.out.println(6);
                break;
            default:


        }
        return numero;


        }



    public Random lanzarDado() {
       return aleatorio ;
    }

    public Dado() {aleatorio=new Random();
    }




    public Random getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(Random aleatorio) {
        this.aleatorio = aleatorio;
    }
}
