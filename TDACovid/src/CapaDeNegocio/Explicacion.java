/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeNegocio;

/**
 *
 * @author ferna
 */
public class Explicacion {
    public static void main(String[] args) {
        double numero=123.456;
        // separar la parte entera
        int parteEntera= (int) numero; //123
         double parteDecimal=numero-parteEntera;//0.456;
         System.out.println("numero Original:"+numero);
          System.out.println("parte Entera:"+parteEntera);
          System.out.println("parteDecimal:"+parteDecimal);
          double numeroSalida=parteEntera+parteDecimal;
          System.out.println("numeroSalida:"+numeroSalida);
         
        
    }
}
