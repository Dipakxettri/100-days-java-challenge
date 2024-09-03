
//Inheritance in Java

//parent/superclass
class Base{
    public int a;
    
    public void setA(int x){
        a = x;
    }
    
    public void getA(){
        System.out.println(a);
    }
    
}

//child/subclass of Base class which includes all the methods and feilds of Base class and also a b variable and its methods of own
class Derives extends Base{
    public int b;
    
    public void setB(int y){
        b = y;
    }
    
    public void getB(){
        System.out.println(b);
    }
    
}

//main program
public class Inheritance {
    
    public static void main(String[] args) {
        
        //object of parent class - Base
        Base b = new Base();
        b.setA(20);
        b.getA();
        
        //object of child class - Derives
        Derives d = new Derives();
        d.setA(40);
        d.getA();
    }
    
} 