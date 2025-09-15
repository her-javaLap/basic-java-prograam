public class question_1 {
    public static void main(String[] args) {
        int arr[]={4,1,8,10,2,12};
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array is:");
        for(int i=0;i<=5;i++){
            System.out.println(+arr[i]);
        }
    }
}
