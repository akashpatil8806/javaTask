 public class MethdoverLoding{
   public int Add(int a,int b){
        return a+b;
    }
    int  Add(int a){
        return a;
    }
    public static void main(String[] args) {
        MethdoverLoding obj=new MethdoverLoding();
        System.out.println(obj.Add(10, 10));
        System.out.println(obj.Add(10));
        
    }
}