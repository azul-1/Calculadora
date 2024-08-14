
package adri.calculadora;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args)
    {
   Scanner digito= new Scanner(System.in);
   Calculadora calculadora = new Calculadora();
  
   System.out.println("Ingresa el numero 1: ");
   double num1 = digito.nextDouble();
   System.out.println("Ingresa el numero 2: ");
   double num2 = digito.nextDouble();
   
   
   System.out.println("Elige la operacion:\n"
           + "1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Divicion");
   System.out.println("Ingrese su opcion:");
   int opcion = digito.nextInt();
   switch(opcion){
       
       case 1:
           System.out.println("El resultado de la suma es: " + calculadora.suma(num1, num2));
           break;
       case 2:
           System.out.println("El resultado de la resta es: " + calculadora.resta(num1, num2));
           break;
       case 3:
           System.out.println("EL resultado de la multiplicacion es: " + calculadora.multiplicacion(num1, num2));
           break;
       case 4:
           if (num2 == 0){
               System.out.println("No puede dividir entre cero");
           }
           else {
               System.out.println("El resultado de la division es: "+ calculadora.dividir(num1, num2));
           }
           break;
       default: 
           System.out.println("Opcion no valida, digite un numero que se encuentre en el menu");
          break;
          
    }
   digito.close();
    }
}
