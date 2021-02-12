/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1.pkg2021;

import java.util.Scanner;

/**
 *
 * @author juanr
 */
public class Laboratorio12021 {

    

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Construyo el objeto calculadotra
        CalculosCalculadora model= new CalculosCalculadora();
        Scanner teclado = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Bienvenido a la calculadora");
        
        while(true){
                System.out.println("Seleccione la opción que desee");
                System.out.println("1 - Suma");
                System.out.println("2 - Resta");
                System.out.println("3 - Multiplicación");
                System.out.println("4 - División");
                System.out.println("5 - Seno");
                System.out.println("6 - Coseno");
                System.out.println("7 - Tangente");
                System.out.println("8 - Potencia");
                System.out.println("9 - Iva al 19%");
                System.out.println("0 - Raiz");

                String opcion = teclado.nextLine();
                String numero1,numero2;
                float resultado;
                switch (opcion)
                {
                    case "1":
                         System.out.println("Digite el primer número");
                         numero1 = teclado.nextLine();
                         System.out.println("Digite el segundo número");
                         numero2 = teclado.nextLine();

                         System.out.println(model.Suma(Float.parseFloat(numero1), Float.parseFloat(numero2)));
                        //desarrollo
                        break;
                    case "2":
                         System.out.println("Digite el primer número");
                         numero1 = teclado.nextLine();
                         System.out.println("Digite el segundo número");
                         numero2 = teclado.nextLine();

                         System.out.println(model.Resta(Float.parseFloat(numero1), Float.parseFloat(numero2)));
                        break;
                    case "3":
                        System.out.println("Digite el primer número");
                         numero1 = teclado.nextLine();
                         System.out.println("Digite el segundo número");
                         numero2 = teclado.nextLine();

                         System.out.println(model.Multiplicacion(Float.parseFloat(numero1), Float.parseFloat(numero2)));
                        //desarrollo
                        //desarrollo
                        break;
                    case "4":
                      System.out.println("Digite el primer número");
                         numero1 = teclado.nextLine();
                         System.out.println("Digite el segundo número");
                         numero2 = teclado.nextLine();

                         System.out.println(model.Division(Float.parseFloat(numero1), Float.parseFloat(numero2)));
                        //desarrollo
  
                        break;
                    case "5":
                        System.out.println("Digite el primer número");
                         numero1 = teclado.nextLine();
                        
                         System.out.println(model.Seno(Double.parseDouble(numero1)));
                      
                        break;
                    case "6":
                        System.out.println("Digite el primer número");
                         numero1 = teclado.nextLine();
                        
                         System.out.println(model.Cos(Double.parseDouble(numero1)));
                        break;
                    case "7":
                     System.out.println("Digite el primer número");
                         numero1 = teclado.nextLine();
                        
                         System.out.println(model.Tan(Double.parseDouble(numero1)));
                        //desarrollo
                        break;
                    case "8":
                        System.out.println("Digite el primer número");
                         numero1 = teclado.nextLine();
                         System.out.println("Digite el segundo número");
                         numero2 = teclado.nextLine();

                         System.out.println(model.Potencia(Double.parseDouble(numero1), Double.parseDouble(numero2)));
                        break;
                    case "9":
                        
                        System.out.println("Digite El numero que quiere sacar el 19% de IVA");
                        numero1 = teclado.nextLine();
                         System.out.println(model.iva(Double.parseDouble(numero1)));
                        //desarrollo
                         
                    case "0":
                        System.out.println("Digite El numero de la raiz");
                        numero1 = teclado.nextLine();
                         System.out.println(model.raiz(Double.parseDouble(numero1)));
                        
                    default:
                        System.out.println("La opción seleccionada no es correcta");
                }
        
        
        }
       
        
    }
    
}
