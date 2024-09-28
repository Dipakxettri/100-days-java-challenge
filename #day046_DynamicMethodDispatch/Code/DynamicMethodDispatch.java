
//Dynamic Method Dispatch

//Super Class
class Phone{
    
    public void on(){
        System.out.println("  Phone opening");
    }
    
    public void call(){
        System.out.println("  calling");
    }
}

//Sub Class
class SmartPhone extends Phone{
    
    @Override //override method
    public void on(){
        System.out.println("  SmartPhone Opening");
    }
    
    public void ring(){
        System.out.println("  SmartPhobe Ringing");
    }
}

public class DynamicMethodDispatch {
    
    public static void main(String[] args) {
       
        //objects
        Phone obj = new SmartPhone();// - Allowed, object of smartphone Class but refrence to Phone Class - Dynamic Method Dispatch
        
        //SmartPhone obj2 = new Phone(); - Not Allowed
        
        //calling methods
        obj.on(); // will take method of SmartPhone because of override - Allowed
        
        obj.call(); // will take method of Phone because it is single method present in an super class but not in sub class - Allowed
        
        //obj.ring(); -  Not Allowed because refrence is phone not smartphone
        
        
    }
    
  }
