
package Div_Num;

// @author Pablo
public class Division_Numero {
    
    private int num1;
    private int num2;

    public Division_Numero() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    
    public void Conversion_Y_Division(String s1,String s2){
    
        
        try{
            setNum1(Integer.parseInt(s1));
            setNum2(Integer.parseInt(s2));
            int result=0;
            System.out.println("num1:"+num1);
            System.out.println("num2:"+num2);
            result=num1/num2;
            System.out.println("resultado:"+result);
        }
        catch(NumberFormatException e){
        
            System.out.println("Error no se pudo convetir las cadenas a números");
        }
        catch(ArithmeticException e){
        
            System.out.println("Error no se puede dividir por cero");
        }

    }
    

}
