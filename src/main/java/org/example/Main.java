package org.example;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        Perecedero coctel1 = new Perecedero();

        coctel1.setNombre("el coctelazo");
        coctel1.setPrecio(15000);
        coctel1.setDiaVencimiento(LocalDate.of(2023,2,28));

        coctel1.calcularCostoCoctel(coctel1.diasDeDuracion());




    }
}