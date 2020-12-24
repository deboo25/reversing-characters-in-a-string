
package doreverse;


public class Stacks {
    private int max;
    private int top;
    private char[] st;
    
    public Stacks(int x){
        max=x;
        st =new char[max];
        top=-1;  
    }
    
    public boolean IsEmpty(){
    return top==-1;}
    
    
public boolean IsFull(){
return top==max-1;}

public void push(char n){
    
        st[++top]=n;
    
}

public char pop(){
    return st[top--];
}

}
