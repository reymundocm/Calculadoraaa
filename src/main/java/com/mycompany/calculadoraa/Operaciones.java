/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraa;

/**
 *
 * @author HP
 */
public class Operaciones {
  public int sumar(int numero1,int numero2){
        int suma=numero1+numero2;
        return suma;
    }
    
    //Metodo de resta
    public int restar(int numero1,int numero2){
        int resta=numero1-numero2;
        return resta; 
    }
    
    //metodo de multoplicacion
    public int multiplicar(int numero1,int numero2){
        int multiplicacion=numero1*numero2;
        return multiplicacion;
    }
    
    //Metodo de resta
    public int division(int numero1,int numero2){
        int division=numero1/numero2;
        return division;
    }
    
    //Metodo de porcentaje
    public int porcentaje(int numero1,int numero2){
        int porcentaje=(numero1/numero2)*100;
        return porcentaje;
    }
    
        //Muestra resultados    
      public void mostarResusltados(int suma, int resta, int multiplicacion, int division, int porcentaje){
          System.out.print("La suma es: " + suma);
          
          System.out.print("La resta esv : " + resta);
          
          System.out.print("La multiplicacion es :  " + multiplicacion);
          
          System.out.print("La division es :  " + division);
          
          System.out.print("El porcentaje es :  " + porcentaje);
      }
}