
package e2p1_ayleenescobar;

public class Numero {
   private int base;
   private String num;
   
   public Numero(){  
   }
   
   public Numero(int base, int num) {
        this.base = base;
     
        this.num=decToBase(num,base);   
    }
     
    public int getBase() {
        return base;
    }
    public void setbase(int base) {
        this.base = base;
    }
    public String getnum() {
        return num;
    }
    public void setnum(String num) {
        this.num = num;
    }

    private char numToChar(int num) {
        char caracter;
        if (num>=0 && num<=9){
            caracter=(char) (num + 48);
        }else {
            caracter=(char) (num +87);
        }
        return caracter;
    }
    
    private int charToNum(char caracter) {
        
        int num=(int)caracter;
        int num2;
        if (num>=0 && num<=9){
            num2=(int) (num - 48);
        }else {
            num2=(int) (num -87);
        }
        return num;
    }
    
    private String decToBase(int num, int base) {
        String numero="";
        String Inversion="";
        int base2=base;
        int division=num;
        while (division >= base2) {
            int n = division % base2;
            division/=base2;
            numero+=numToChar(n);
        }
        numero+=numToChar(division);
        int tamaño=numero.length()-1;
        while(tamaño>=0){
            char C=numero.charAt(tamaño);
            Inversion+=C;
            --tamaño;
        }
       return Inversion; 
    }
    
    private int baseToDec(String num, int base) {
        int k=0;
        int j=0;
        int origen=0;
        int potencia;
        int cont=0;
        for (int i = num.length() - 1; i >= 0; i--) {
            k=(int)num.charAt(i);
            if(k>=48&&k<=57){
                j=k-48;
            }
            else if(k>=97&&k<=122){
                j=k-97;
            }
            potencia=(int)Math.pow(base,cont);
            origen=j*potencia;
            ++cont;
        }
        return origen;
    }
}
