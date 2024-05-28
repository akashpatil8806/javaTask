public class MethodOverriding {

    void Car() {
        System.out.println("it is BMW");
    }
}

class Demo extends MethodOverriding{
     void Car(){
        System.out.println("this is Pluser");
    }
}
class mainpart{
    public static void main(String[] args) {
        MethodOverriding o= new MethodOverriding();
        o.Car();
        Demo obj =new Demo();
        obj.Car();

    }

}