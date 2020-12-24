
package doreverse;


public class REverser {
    
   private String input;
   private String output;
   public REverser(String x){
       input=x;
       
   }
   
   public String doRev(){
       int size=input.length();
       Stacks s=new Stacks(size);
       for(int i=0;i<size;i++){
           char c=input.charAt(i);
           s.push(c);
       }
       output=" ";
       while(!s.IsEmpty()){
           output=output+s.pop();
       }
       return output;
   }
}
