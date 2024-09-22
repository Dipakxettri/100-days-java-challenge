
//Method Overriding

//Base Class
class A{
    
    public int a = 2;
    
    public void meth1(){
        System.out.println("  I am method 1 of class A");
    }
}

//Derive Class
class B extends A{
    
    @Override //Override Notation - not necessary but recommended
    public void meth1(){//override method
        System.out.println("  I am method 1 of class B");
    }
}

public class MethodOverriding {
    
    public static void main(String[] args) {
        
        A a = new A();
        a.meth1();//prints the method of class A
        B b = new B();
        b.meth1();//prints the method of class B
        
    }
    
}
