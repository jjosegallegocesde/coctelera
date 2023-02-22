package org.example;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Perecedero extends Coctel{

    private LocalDate diaVencimiento;
    private LocalDate diaElaboracion;


    public Perecedero() {
        this.diaElaboracion=LocalDate.now();
    }


    public LocalDate getDiaVencimiento() {
        return diaVencimiento;
    }

    public void setDiaVencimiento(LocalDate diaVencimiento) {
        this.diaVencimiento = diaVencimiento;
    }

    public Long diasDeDuracion(){
        return ChronoUnit.DAYS.between(this.diaElaboracion,this.diaVencimiento);
    }

    public void calcularCostoCoctel(Long dias){

        if(dias==0){
            System.out.println("mismo precio");
        }else if(dias == 1){
            System.out.println("0.5");
        }else if(dias == 2){
            System.out.println("1");
        }else if(dias == 3){
            System.out.println("2");
        }else{
            System.out.println("eso no se puede vender");
        }

    }



}
