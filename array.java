public class array {
    public static void main(String[] args) {
        int arr[]={5,7,2,4,9,11,23};
        System.out.println("this is the odd even progrm");
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.println(" this is the even array" +i);

            }
        }
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.println(" this is the odd array"+i);
            }
        }
        

    }
    
}
