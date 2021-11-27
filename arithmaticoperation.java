import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
public class arithmaticoperation{ 
    public static int arithmatic(int  a, int b, char c){
        int result=0;
        if(c=='+'){
             result= a+b;
            
            
        


        }
         else if(c=='-'){
         result= a-b;
            
            

        }
        else if(c=='*'){
            result= a*b;
        
            

        }
       else  if(c=='/'){
            result= a/b;
        
            

        }
        else{
            System.out.println("invalid...");
            
        }
        return result;
         
             
        
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first numer: ");
        int a=sc.nextInt();
        System.out.println("enter secound number");
        int  b=sc.nextInt();
        System.out.println("Type operator:+/*/-/'/'");
        char c=sc.next().charAt(0);
         int result=arithmatic(a,b,c);
         System.out.println("Result should be: "+result);

        




    }
}