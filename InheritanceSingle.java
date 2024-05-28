
// single Inheritance
/**
 * Inheritance
 */
 class Demo {
    void car(){
        System.out.println(" this is the car collection ");
    }
}
 class bike extends Demo{
    void bike1(){
        System.out.println("this is the bike car collection");
    }
    
}
class Imp{
    public static void main(String[] args) {
        // we cerating the object of the child class that are bike
        bike b=new bike();
        b.car();
        b.bike1();

    }
}

    

     
