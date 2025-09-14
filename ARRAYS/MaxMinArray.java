public class MaxMinArray {
    public static void main(String[] args) {
        int arr[]={1,4,3,8,10};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<=4;i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Maximum value:"+max);
        System.out.println("Minmun value:" +min);

        }
    }

