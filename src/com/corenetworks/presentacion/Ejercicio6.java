package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio6 {
    public static void main(String[] args) {
        //1
        LocalDate fechaNacimiento=LocalDate.of(1992,8,30);
        Period edad   = Period.between(fechaNacimiento,LocalDate.now());
        System.out.println(edad.getYears());
        //2
        LocalDate fechaHoy=LocalDate.now();
        System.out.println(fechaHoy);
        //3
        LocalDate inicioCurso=LocalDate.of(2023,10,9);
       LocalDate inicioCurso2MesesMas= LocalDate.from(inicioCurso.plusMonths(2));
        System.out.println(inicioCurso2MesesMas);
    }
}
