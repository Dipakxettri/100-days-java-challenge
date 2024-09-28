
//Abstract Classes And Abstract Methods

//abstract base class
abstract class SmartPhoneModel{
    
    abstract public void ringingSound();//abstract method
}

//child derived classes
//samsung model
class Samsung extends SmartPhoneModel{
    
    //constrocter to print phone model
    public Samsung(){
        System.out.println("  Smasung Mobile");
    }
    
    //override method which is abstract method
    @Override
    public void ringingSound(){
        System.out.println("  Immagine");
    }
}

//redmi model
class Redmi extends SmartPhoneModel{
    
    //constrocter to print phone model
    public Redmi(){
        System.out.println("  Redmi Mobile");
    }
    
    //override method which is abstract method
    @Override
    public void ringingSound(){
        System.out.println("  Sercifice");
    }
}

public class AbstractClassesAndMethods{
    
    public static void main(String[] args) {
        
        //objects 
        //SmartPhoneModel sm = new SmartPhoneModel(); - error
        Samsung s = new Samsung();
        s.ringingSound();
        Redmi r = new Redmi();
        r.ringingSound();
    }
}

//Note : The different class can be created with abstract class and the abstract method can be override in child classes, we can't create a object of abstract class but of its child class
