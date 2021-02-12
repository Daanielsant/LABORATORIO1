/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1.pkg2021;

/**
 *
 * @author juanr
 */
public class CalculosCalculadora {
    //atributos (opcional)
    
    //constructor
    public CalculosCalculadora(){}
    
    //metodos
    //suma
    public float Suma(float numero1, float numero2){
        return numero1+numero2;//1
    }
    
    public float Resta(float numero1, float numero2){
        return numero1-numero2;//2
    }
    
    public float Multiplicacion(float numero1, float numero2){
        return numero1*numero2;//3
    }
    
    public float Division(float numero1, float numero2){
        return numero1/numero2;//4
    }
    
    public double Seno(double numero1)
    {
        return Math.sin(numero1);//5
    } 
    
    public double Cos(double numero1)
    {
        return Math.cos(numero1);//6
    }
    
    public double Tan(double numero1)
    {
        return Math.tan(numero1);//7
    }
    
    public double Potencia(double numero, double potencia)
    {
        return Math.pow(numero, potencia);//8
    }
    
    public double iva(double numero)
    {
        return (numero +(numero*0.19));
    }
    
public double raiz(double numero)
    {
        return (Math.sqrt(numero));
    }
    
    
    public boolean ValidacionDivisionCero(float numero1, float numero2){
        if(numero2==0){
            return false;
        }
        return true;
    }
    
    public boolean ValidacionTangente(double numero){
        if(numero==90 || numero==-90){
            return false;
        }
        return true;
    }
    
}
