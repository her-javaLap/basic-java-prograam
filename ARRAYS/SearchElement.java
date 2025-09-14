public class SearchElement {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int target=30;
        for(int i=0;i<=5;i++){
            if(arr[i]==target){
                System.out.println( "target :"+target+  "   found at index :" +i);
            }
        }
    }
}
