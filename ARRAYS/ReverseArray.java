public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("orginal array:");
        for(int i=0;i<=5;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Reverse array:");
        for( int i=6-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
}
