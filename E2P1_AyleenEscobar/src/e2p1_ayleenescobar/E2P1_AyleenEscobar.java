
package e2p1_ayleenescobar;
import java.util.Scanner;
import java.util.ArrayList;

public class E2P1_AyleenEscobar {
static ArrayList<Numero> numero = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc_p = new Scanner(System.in);
        
        boolean respuesta = true;
        while (respuesta){
            System.out.println("Examen II");
            System.out.println("Numeros");
            System.out.println("Operaciones");
            System.out.println("Salir");
            
            
            
            /*Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el primer indice:");
            int r1= sc.nextInt();
            System.out.print("Ingrese el segundo indice:");
            int r2= sc.nextInt();*/
            }
            
            
              
        }
        
    public static void numerosm(){
        
    }
    
    
    public static void IngresoDatos() {
        Scanner sc = new Scanner(System.in);
        Scanner sc_p = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
            int numero= sc.nextInt();
            while (numero<1){
                System.out.println("El numero debe ser mayor que 1.");
                System.out.print("Ingrese el numero: ");
                numero= sc.nextInt();
            }
            System.out.print("Ingrese la base: ");
            int base= sc.nextInt();
            while(base<2 && base>35){
                System.out.println("La base debe estar en 2 y 35.");
                System.out.print("Ingrese la base: ");
                base= sc.nextInt();
            }
        }
    
    public static void Disponibles() {
        System.out.println("Lista de numeros; ");
        System.out.println("");
        for (int i = 0; i < numero.size(); i++) {
            Numero sacado = numero.get(i);
            System.out.println((i+1)+"."+sacado.getnumero()+ " base "+sacado.getBase_num());
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
    
    
