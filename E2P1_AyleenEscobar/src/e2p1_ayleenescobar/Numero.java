
package e2p1_ayleenescobar;

public class Numero {
   private int base_num;
   private String numero;
   
   public Numero(){  
   }
   
   public Numero(int base, int num) {
        this.base_num = base;
        this.numero=decToBase(num);
        
        
    }
    public int getBase_num() {
        return base_num;
    }
    public void setbase_num(int base_num) {
        this.base_num = base_num;
    }
    public String getnumero() {
        return numero;
    }
    public void setnumero(String numero) {
        this.numero = numero;
    }

    private int numToChar(int num) {
        int n=0;
        for (int i = 0; i < 0; i++) {
           n= this.base_num/this.numero;
        }
        return n;
    }
    
    private int charToNum(int num) {
        
    }
    
    private int decToBase(int num) {  
    }
    
    private int baseToDec(int String) {  
    }
}
