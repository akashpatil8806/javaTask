// this keywrd is the refer to the current object to and constructor.
// whenever  the name of the instance and local variabe both are same then Jvm are confused 
// which one is the local variable and which one is instance variable so avoid this problem we use the this keyword

/**
 * ThisKeyword4
 */
public class ThisKeyword4 {
    int a; // it is inatace variable 
      ThisKeyword4(int a){
        this.a=a;
     }
     void show(){
        System.out.println(a);
     }

    public static void main(String[] args) {
        ThisKeyword4 obj=new ThisKeyword4(100);
        obj.show();  
    }

    
}