
//Interfaces 

//Interface class
interface Vehical{
    
    //Abstract Methods
    void run(int increment);
    void stop();
}

//implement class 1
class Bus implements Vehical{
    int speed = 4;
    public void run(int increment){
        speed = speed + increment;
        System.out.println(speed);
    }
    
    public void stop(){
        speed = 0;
        System.out.println(speed);
    }
}

//implement class 2
class Car implements Vehical{
    int speed = 8;
    public void run(int increment){
        speed = speed + increment;
        System.out.println(speed);
    }
    
    public void stop(){
        speed = 0;
        System.out.println(speed);
    }
}

public class Interfaces{
    
    public static void main(String[] args) {
        //Vehical v = new Vehical();//error
        
         Bus b = new Bus();//object of bus
        b.run(10);
        b.stop();
        
        Car c = new Car();//object of car
        c.run(20);
        c.stop();
        
        
        
    }
}
