
package calculadorapoo;

public class operaciones {
    
    //ATRIBUTOS
    private String digito;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean potencia; 
    private boolean raiz;     
    private boolean sen;
    private boolean cos;
    private boolean tan;
    private boolean iva;
    
    //CONSTRUCTOR
    public operaciones()
    {
        digito = "";
        resultado = 0;
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        potencia = false;
        raiz = false;
        sen = false;
        cos = false;
        tan = false; 
        iva = false;
        potencia = false;
        raiz = false;
    }
    
    //GETTER Y SETTER

    public String getDigito() { // OBTIENE EL VALOR
        return digito;
    }

    public void setDigito(String digito) { //COLOCA EL VALOR
        this.digito = digito;
    }
    
    //METODOS Y FUNCIONES
    public void agrgarNum(int num){
        
        setDigito(digito+num);
    }
    
    public void Suma(String numero){
        this.resultado=Double.parseDouble(numero);
        suma = true;
        setDigito("");
    }
    
    public void Resta(String numero){
        this.resultado=Double.parseDouble(numero);
        resta = true;
        setDigito("");
    }
    
    public void Multiplicacion(String numero){
        this.resultado=Double.parseDouble(numero);
        multiplicacion = true;
        setDigito("");
    }
    
    public void Division(String numero){
        this.resultado=Double.parseDouble(numero);
        division = true;
        setDigito("");
    }
    
    public void Sen(String numero){
        this.resultado=Double.parseDouble(numero);
        sen = true;
        setDigito("");
    }
    
    public void Cos(String numero){
        this.resultado=Double.parseDouble(numero);
        cos = true;
        setDigito("");
    }
    
    public void Tan(String numero){
        this.resultado=Double.parseDouble(numero);
        tan = true;
        setDigito("");
    }
    
    public void Iva(String numero){
        this.resultado=Double.parseDouble(numero);
        iva = true;
        setDigito("");
    }
    
    public void Potencia(String numero){
        this.resultado=Double.parseDouble(numero);
        potencia = true;
        setDigito("");
    }
    
    public void Raiz(String numero){
        this.resultado=Double.parseDouble(numero);
        raiz = true;
        setDigito("");
    }
    
    public double calculoigual(String numero){
        if (suma == true)
        {
            resultado = resultado + Double.parseDouble(numero);
        }
        else if (resta == true)
        {
            resultado = resultado - Double.parseDouble(numero);
        }
        else if (multiplicacion == true)
        {
            resultado = resultado * Double.parseDouble(numero);
        }
        else if (division == true)
        {
            resultado = resultado / Double.parseDouble(numero);
            
            if (resultado == 0 )
            {
                System.out.println("Math Error");
            }
           
        }
        else if (sen == true)
        {
            double sen=Math.toRadians(resultado);
            
            resultado=Math.sin(sen);
           
        }
        else if (cos==true){
            
            double cos=Math.toRadians(resultado);
            
            resultado=Math.cos(cos);
        }
        else if (tan == true)
        {
            double tan=Math.toRadians(resultado);
            
            resultado=Math.tan(tan);
        }
        else if (iva == true)
        {
            resultado=Double.parseDouble(numero)*0.19;
           
        }
        else if (potencia == true)
        {
            resultado=Math.pow(resultado,Double.parseDouble(numero));
           
        }
        else if (raiz == true)
        {
            resultado=Math.sqrt(Double.parseDouble(numero));
           
        }
        
        //RESETEAR VALORES
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        potencia = false;
        raiz = false;
        sen = false;
        cos = false;
        tan = false; 
        iva = false;
        potencia = false;
        raiz = false;
        
        //RETORNAR VALORES
        return resultado;
    }

}
