//A class which is declared with the abstract keyword is known as an abstract class

abstract class Student{
     abstract void add(int a,int b);

    
}
class Teacher extends Student{
    void add(int a, int b){
        System.out.println(a+b);
        
    }
    
}

class main1{
    public static void main(String[] args) {
        Student obj= new Teacher();
        obj.add(10,10);
        
    }
}