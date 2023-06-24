
package e2p1_ayleenescobar;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class E2P1_AyleenEscobar {
static ArrayList<Numero> numero = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc_p = new Scanner(System.in);
        
        boolean respuesta = true;
        while (respuesta){
            Object[] opciones = {"Numeros\n", "Operaciones\n", "Salir\n"};

        // botones
        int opcion2 = JOptionPane.showOptionDialog(null, "Examen II\n", "", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            switch (opcion2){
                case 0: {
                    System.out.println("1.Agregar numero.\n"+
                             "2.Eliminar numero.\n"+
                             "3.Menu Principal\n");
                    int opcion3 = sc.nextInt();
                    switch (opcion3){
                        case 1: {
                            IngresoDatos();
                        }break;
                        
                        case 2:{
                            Eliminar();
                        } break;
                
                        case 3:{
                            
                        }break;
                    }
                } break;
                
                case 1:{
                    System.out.println("1.Sumar Numeros.");
                    System.out.println("2.Restar Numeros.");
                    System.out.println("3.Multiplicar Numeros.");
                    System.out.println("4.Menu Principal.");
                    int opcion3 = sc.nextInt();
                    switch (opcion3){
                        case 1: {
                            sumar();
                        }break;
                        
                        case 2: {
                            restar();
                        }break;
                        
                        case 3: {
                            multiplicar();
                        }break;
                    }
                } break;
                
                case 2:{
                    respuesta =false;
                }
            }
            
        }  
              
        }

    
    public static void IngresoDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
            int num= sc.nextInt();
            while (num<1){
                System.out.println("El numero debe ser mayor que 1.");
                System.out.print("Ingrese el numero: ");
                num= sc.nextInt();
            }
            System.out.print("Ingrese la base: ");
            int base= sc.nextInt();
            while(base<2 && base>35){
                System.out.println("La base debe estar entre 2 y 35.");
                System.out.print("Ingrese la base: ");
                base= sc.nextInt();
            }
            Numero numeritos = new Numero(base, num);
            numero.add(numeritos);
        }
    
    public static void Disponibles() {
        System.out.println("Lista de numeros; ");
        System.out.println("");
        for (int i = 0; i < numero.size(); i++) {
            Numero sacado = numero.get(i);
            System.out.println((i+1)+"."+sacado.getnum()+ " base "+sacado.getBase());
            System.out.println("");
        }
    }
    
    public static void Eliminar(){
        Scanner sc = new Scanner(System.in);
        if(numero.size() == 0){
            System.out.println("NO HAY NINGUN NUMERO INGRESADO.");
            System.out.println("");
        } else{
            Disponibles();
            System.out.print("Ingrese el indice que desea eliminar: ");
            int elim = sc.nextInt();
            numero.remove(elim-1);
            }
    }
    
    public static void sumar(){
        
    }
    
    public static void restar(){
        
    }
    
    public static void multiplicar(){
        
    }
    
    } 
    
    
