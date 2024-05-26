public class ThisKeyword5 {
    ThisKeyword5(){
        System.out.println("this is the this keyword");
    }
    ThisKeyword5(int a){
        this();
        System.out.println("this is the this keyword111");
    }
      void show(){
        System.out.println("");


      }
    public static void main(String[] args) {
        ThisKeyword5 obj=new ThisKeyword5(100);
        obj.show();
        
    }
    
}
