//Laboratioro1 
//Andrés Mazariegos 21749
import java.util.Scanner;
public class Pig {
   
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenidos a PIG");
        System.out.println("JUGADOR 1 TIRA CON TECLA 1");
        System.out.println("JUGADOR 2 TIRA CON TECLA 2");
        Dado dado1,dado2;
        //Creamos los objetos y declaramos variables 
        dado1= new Dado();
        dado2= new Dado();
        Jugador jugador1,jugador2;
        jugador1= new Jugador();
        jugador2 = new Jugador();
        //Variables para manejar los puntos generales y los puntos por ronda 
        int ronda;
        int ronda_2do_jugador;
        int puntos_acumulados;
        int puntos_acumulados_2do_jugador;
        int contador=0;
        int contador2= 0;
      
       
        //Ciclo principal que continuara hasta que uno de los dos jugadores tenga 100 puntos generales 
        while (jugador1.getPuntuacion()< 100 && jugador2.getPuntuacion()<100){
            //Pedimos al usuario que elija que jugador va a tirar 
            System.out.println("TIRA (RESPETA LOS TURNOS)");
            int opcion= scanner.nextInt();
            //Si elije 1 tira el jugador 1 
            if(opcion==1){
                System.out.println("TURNO JUGADOR 1");
            //Equivale a lanzar los dados con el jugador 1 
            //seteamos los valores
                dado1.setValor();
                dado2.setValor();
            //Obtenemos los valores de los dados y los asignamos a una variable 
                int valor= dado1.getValor();
                int valor2 =dado2.getValor();
                //Condicionales para que si uno de los dos valores es 1 no se sume puntaje ni a la ronda ni al puntaje total 
                if(valor== 1){
                //Llamamos los metodos necesarios de la clase Jugador 
                jugador1.SetResetearJugador();
                jugador1.setRonda(0+0);
                contador=0;
                puntos_acumulados= jugador1.GetResetearJugador();
                System.out.println("Primer dado: " + valor);
                System.out.println("Segundo dado:" + valor2);
                System.out.println("Sacaste un 1  tu puntuacion de ronda es " + puntos_acumulados + " y tu puntuacion general es "+ puntos_acumulados);
                System.out.println("Turno del JUGADOR 2, presiona 2 ");;
                

                }
                else if (valor2==1){
                    //Llamamos los metodos necesarios de la clase Jugador 
                    jugador1.SetResetearJugador();
                    jugador1.setRonda(0);
                    contador=0;
                    puntos_acumulados= jugador1.GetResetearJugador();
                    System.out.println("Primer dado: " + valor);
                    System.out.println("Segundo dado:" + valor2);
                    System.out.println("Sacaste un 1  tu puntuacion de ronda es " + puntos_acumulados + " y tu puntuacion general es "+  puntos_acumulados);
                    System.out.println("Turno del JUGADOR 2, presiona 2 ");
                



                }
                //Si ningun valor es uno se suman los valores y eso se suma al puntja de ronda que en cada ronda se hace 0 y tambien se suma al puntaje total
                else {
                    //Llamamos los metodos necesarios de la clase Jugador 
                    System.out.println("Primer dado: " + valor);
                    System.out.println("Segundo dado:" + valor2);
                    // El puntaje de la ronda es igual 
                    jugador1.setRonda(valor+valor2);
                    puntos_acumulados= jugador1.getRonda();
                    ronda= (valor + valor2);
                    contador= contador + ronda;
                    jugador1.setPuntuacion(ronda);
                    int puntuacion_total = jugador1.GetResetearJugador();
                    System.out.println("Tus puntos de esta ronda son " + ronda + " y tu puntuacion general es "+ puntos_acumulados);
                    //Condicional para que cuando el puntaje de una ronda sea 20 o más se avise en pantalla que es el turno del otro jugador 
                
                        if (contador>=20){
                            contador=0;
                            System.out.println("HAS EXCEDIDO LOS PUNTOS SEGUIDOS PERMITIDOS(20) TURNO DEL JUGADOR 2, PRESIONA 2 ");
                        
                
                        }else{
                            System.out.println("Puedes seguir tirando o ceder el turno ");
                
                        }
                        //Llamamos al metodo necesario de la clase jugador si el jugador obtiene 100 puntos o más 
                        if (puntos_acumulados >= 100){
                        jugador1.felicitar("JUGADOR 1");;
                        
                        }
                    
                    




                }
                
            //Esto es el mismo codigo pero aplicado para el jugador 2 
            }else{
                System.out.println("TURNO JUGADOR 2 ");

                dado1.setValor();
                dado2.setValor();
                int valor= dado1.getValor();
                int valor2 =dado2.getValor();
                if(valor== 1){
                    jugador2.SetResetearJugador();
                    jugador2.setRonda(0+0);
                    contador2=0;
                    puntos_acumulados_2do_jugador= jugador2.GetResetearJugador();
                    System.out.println("Primer dado: " + valor);
                    System.out.println("Segundo dado:" + valor2);
                    System.out.println("Sacaste un 1  tu puntuacion de ronda es " + puntos_acumulados_2do_jugador + " y tu puntuacion general es " + puntos_acumulados_2do_jugador);
                    System.out.println("Turno del JUGADOR 1, presiona 1 ");;
                

                }
                else if (valor2==1){
                    jugador2.SetResetearJugador();
                    jugador2.setRonda(0);
                    contador2=0;
                    puntos_acumulados_2do_jugador= jugador2.GetResetearJugador();
                    System.out.println("Primer dado: " + valor);
                    System.out.println("Segundo dado:" + valor2);
                    System.out.println("Sacaste un 1  tu puntuacion de ronda es " + puntos_acumulados_2do_jugador + " y tu puntuacion general es "+  puntos_acumulados_2do_jugador);
                    System.out.println("Turno del JUGADOR 1, presiona 1 ");



                }
                else {
                    System.out.println("Primer dado: " + valor);
                    System.out.println("Segundo dado:" + valor2);
                    jugador2.setRonda(valor+valor2);
                    puntos_acumulados_2do_jugador= jugador2.getRonda();
                    ronda_2do_jugador= (valor+valor2);
                    contador2= contador2 + ronda_2do_jugador;
                    jugador2.setPuntuacion(ronda_2do_jugador);
                    int puntuacion_total = jugador2.GetResetearJugador();
                    System.out.println("Tus puntos de esta ronda son " + ronda_2do_jugador + " y tu puntuacion general es "+ puntos_acumulados_2do_jugador);
                    
                        if (contador2>=20){
                            
                           contador2=0;
                            System.out.println("HAS EXCEDIDO LOS PUNTOS SEGUIDOS PERMITIDOS (20); TURNO DEL JUGADOR 1, PRESIONA 1");
                            
                            }
                            else {
                            System.out.println("Puedes seguir tirando o ceder ");
                            }
                        if (puntos_acumulados_2do_jugador >= 100){
                            jugador2.felicitar("JUGADOR 2");
                        
                        }

            }
            
            
            
            


            } 


        }

         
        


    }
}