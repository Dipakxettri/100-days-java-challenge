
//Inheritance

//parent class which is Animal
class Animal{
    public String name;
    
    public void setName(String n){
        name = n;
    }
    
    public void getName(){
        System.out.println(name);
    }
}

//child class which is Cat
class Cat extends Animal{
    
}

//main program
public class AnimalCat {
    
    public static void main(String[] args) {
        
        //object of parent class
        Animal a = new Animal();
        a.setName("Animal");
        a.getName();
        
          //object of child class
        Cat c = new Cat();
        c.setName("Cat");
        c.getName();
    }
    
}