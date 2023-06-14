/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra1;

import Entidad.Vehiculo;

/**
 *
 * @author nataliaba
 */
public class POOExtra1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Vehiculo v1 = new Vehiculo("Ford", "Laguna", 2020, "auto");
    Vehiculo v2 = new Vehiculo("Honda", "Dax", 2018, "moto");
    Vehiculo v3 = new Vehiculo("Mussetta", "MountainBike", 2023, "bici");

    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
    System.out.println("");

    System.out.println("El vehiculo " + v1.getTipo() + " se movera " + v1.moverse(5)
            + " metros en 5 segundos, " + v1.moverse(10) + " metros en 10 segundos y "
            + v1.moverse(60) + " metros en 60 segundos");
    //System.out.println("El vehiculo " + v1.getTipo() + " se movera " + v1.moverse(10) + " metros en 10 segundos");
    //System.out.println("El vehiculo " + v1.getTipo() + " se movera " + v1.moverse(60) + " metros en 60 segundos");
    System.out.println("El vehiculo " + v2.getTipo() + " se movera " + v2.moverse(5) + " metros en 5 segundos");
    System.out.println("El vehiculo " + v2.getTipo() + " se movera " + v2.moverse(10) + " metros en 10 segundos");
    System.out.println("El vehiculo " + v2.getTipo() + " se movera " + v2.moverse(60) + " metros en 60 segundos");
    System.out.println("El vehiculo " + v3.getTipo() + " se movera " + v3.moverse(5) + " metros en 5 segundos");
    System.out.println("El vehiculo " + v3.getTipo() + " se movera " + v3.moverse(10) + " metros en 10 segundos");
    System.out.println("El vehiculo " + v3.getTipo() + " se movera " + v3.moverse(60) + " metros en 60 segundos");
    System.out.println("");

    double logradoAuto = (v1.moverse(300) + v1.frenar());
    double logradoMoto = (v2.moverse(300) + v2.frenar());
    double logradoBici = (v3.moverse(300) + v3.frenar());

    System.out.println("El auto avanzara " + logradoAuto + " metros"); //902
    System.out.println("La moto avanzara " + logradoMoto + " metros"); //602
    System.out.println("La bici avanzara " + logradoBici + " metros"); //300
    System.out.println("");
    
    if(logradoAuto > logradoMoto && logradoAuto > logradoBici) {
      
      System.out.println("El vehiculo " + v1.getTipo() + " avanzó mas. Recorrió " + logradoAuto);
      
    } else if (logradoMoto > logradoAuto && logradoMoto > logradoBici) {
      
      System.out.println("El vehiculo " + v2.getTipo() + " avanzó mas. Recorrió " + logradoMoto);
      
    } else {
      
      System.out.println("El vehiculo " + v3.getTipo() + " avanzó mas. Recorrió " + logradoBici);
    }
    
  }

}
