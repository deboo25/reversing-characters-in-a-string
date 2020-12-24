
package doreverse;
import java.util.Scanner;

public class DoReverse {

  
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String a=sc.nextLine();
       REverser z=new REverser(a);
       System.out.println(z.doRev());
    }
    
}
