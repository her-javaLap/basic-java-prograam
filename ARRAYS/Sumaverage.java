public class Sumaverage {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int sum=0;
        for(int i=0;i<=4;i++){
            sum +=arr[i];
        }
       double average= (double)sum/4;
        System.out.println("sum:"+sum);
        System.out.println("average:"+average);
    }
}
