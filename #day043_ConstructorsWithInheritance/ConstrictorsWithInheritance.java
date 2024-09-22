
//Constrictors With Inheritance

//Base Class
class A{
    
    public int a;
    public int b;
    
    public A(){
        System.out.println("  1 st constrocter of Class A");
    }
    
    public A(int a){
        this.a = a;
        System.out.println("  2nd constrocter of class A " + a);
    }
}

//Dervied Class
class B extends A{
    
    public B(){
        System.out.println("  1st constrocter of Class B");
    }
    
    public B(int b){
        super(10);
        this.b = b;
        System.out.println("  2nd constrocter of Class B " + b);
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B(10);
        
        
    }
    
}
