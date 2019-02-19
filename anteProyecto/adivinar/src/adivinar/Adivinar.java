/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinar;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Adivinar {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //creamos el menu de ingreso a cualquier juego 
        boolean regresar= false ;
        int menu ;
        Scanner opcionesScanner = new  Scanner(System.in);
         while (!regresar) {
        
                System.out.println("  HOLA, TE OFRECEMOS UN CATALOGO DE JUEGOS ");
                System.out.println("Ahorcado...................(1)");
                System.out.println("Poker .....................(2)");
                System.out.println("Basquett...................(3)");
        
        
     
                    menu = opcionesScanner.nextInt();// pedimos al usuario que elija la opcion 

        switch(menu){//si escoge  la opcion 1  automatiacmnte comeinza el juego de ahorcado
            case 1:
                
            
             
        
                             //comienza el juego del ahorcado 1111111
    
                    String [] palabras ={"ingenieria", "mate","sistemas"};//introducimos la palabras que desea adivinar el ususario 
                    int posicionAletoria = (int) Math.floor(Math.random()*palabras.length);//utlizamos el comando random para que la maquina escoja en aleteatorio cualquier palabra 
                    String palabra = palabras[posicionAletoria];
                    int contador=0;//nuestro contador lo iniciamos en 0

        
        
        

                //nuestro menu de bienbenida
                System.out.println("BIENVENIDO  A ESTE JUEGO ");
                System.out.println("TIENES 10 Oportunidades para Ganar ADELANTE");
                System.out.println("De lo contrario perderas ");
                 System.out.println("    _  _");
                 System.out.println("   (.)(.)");
                 System.out.println("  /  ()  \\ ");
                System.out.println(" _\\ '--' /_ ");
            System.out.println("{ '-`\"\"\"\"`-' } ");
                 System.out.println("`\"/      \\\"` ");
                      System.out.println(" \\      / ");
                      System.out.println(" _/  /\\  \\_");
                      System.out.println(" {   /  \\   }");
                       System.out.println("`\"`    `\"`");

              
        System.out.println("**************************");
        System.err.println("Intrucciones: Comienzas introduciendo cualquier letra");
        System.out.println("**************************");
        System.out.println("Pilas... dale cualaquiera  ");
        
        
        char[] letras = palabra.toCharArray();//creamos otro array que sea del mismo tamanio que el de la parabra secreta 
        char[] letrasConGuiones = new char[letras.length];// para no dejarlo en blanco colocamos guiones para ver de cuanto es mas o menos la loongitud de la palabra secreta 
        
        
        for(int i=0; i<letras.length;i++){//condicion de las letras con guiones para que no se exeda de la palabra secreta 
            letrasConGuiones[i]='-';
        
        }
        System.out.println(letrasConGuiones); //mostramos la palabra secreto pero con( --------)
        
        
        boolean hemosGanado =false;
        
        
            while(hemosGanado==false){ //mientras aun no completan la palabra secreta se cumplira 

            Scanner lector = new Scanner(System.in);
                char letraIntroducida = lector.next().charAt(0);//comensamos a pedir letras 
        
            for (int i=0; i<letras.length; i++ ){            //comensamos a recorrer el arreglo para ver si encontramos algun acierto 
                 if(letras[i]==letraIntroducida){
                    letrasConGuiones[i]=letraIntroducida; 
                   
                 }
               
                 
            
        }
            contador++; // contador va imcrementado en 1 
            //condicionamos nuestro contador, cuando llegue a los 10 intentos  el juego acabe 
            if (contador==10){
                System.out.println("LO SENTIMOS TUS OPORTUNIDADES SE ACABARON ");
                  System.exit(0);//comando para terminar el juego 
                
           }
            
                if(Arrays.equals(letras, letrasConGuiones)){//comparamos los dos arreglos 
                    System.out.println("******EXITO******");// si coinciden que escriba lo demas 
                    System.out.println("las opurtunidades fueron\n"+contador);//imprime el numero de oportunidades 
                      System.exit(0);
            
        }           
                    System.out.println(letrasConGuiones);//muestra la palabra secreta que ya no es secreta 
                    
        }
          
            
            
                }   
        
         

         
         
        }
         }
    }
       
    

         
         

    

