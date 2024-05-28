class Demo {
    void FirstYear(){
        System.out.println(" i am first year student");
    }
    
}
class Demo1 extends Demo{
    void SecondYear(){
        System.out.println(" this is second year student");
    }
}

class Third extends Demo{
    void ThirdYear(){
        System.out.println(" this is the third year class");
    }
}

public class InheritanceHirc {
    public static void main(String[] args) {
        Third obj =new Third();
        obj.ThirdYear();
        Demo1 obj1 =new Demo1();
        obj1.SecondYear();
        obj1.FirstYear();

    }

    
}
