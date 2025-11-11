/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author carpi
 */
public class EVA3_1_METODOS {

    
    public static void main(String[] args) {
     int val1 = 5, val2 = 10;
     //1.- Modificadores de acesso: public, protected, private, default
     int resu = sumarEnteros(val1, val2);
     System.out.println("Suma de 5+10= " +  resu);
     //2 no necesito guardar el valor, un solo uso
     System.out.println("Suma de 5 + 10 = " + sumarEnteros(val1,val2));
     //3 NECESITO EJECUTAR EL METODO, NO INTERESA EL RESULTADO
     sumarEnteros(val1, val2);
    }
    //METODO PARA SUMAR DOS ENTEROS
    //1.- Modificadores de acesso: public, protected, private, default
    //2.- static -->PARA USAR LOS METODOS DENTRO DEL MAIN
    //3.- Valor de retorno: cualquier tipo de dato
    //  vold --> si no quieren regresar un valor
    //4.- nombre del metodo: mismas reglas que los identificadores
    //5.- lista de parametros: pueden ser cero o N cantidad
    //1           2        3        4        5    
    public static int sumarEnteros(int num1, int num2){
        int suma = num1 + num2;
        return suma;
       
    }
    }


