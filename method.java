// method:A method is a block of code or collection of statements, reusablity,easy modification
public class method {
    // this is the defoult method
    void add(){
        int a=10;
        int b=10;
        int c=a+b;
        System.out.println("the addition is "+c);
    }
    // this is the parameterised method
    void sub(int a1,int b1){
        int c1=a1+b1;
        System.out.println(c1);
    }
    public static void main(String[] args) {
        method obj=new method();
        obj.add();
        obj.sub(20, 10);
    }
    
}
