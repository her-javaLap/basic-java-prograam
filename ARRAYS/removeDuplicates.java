public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 4,5,10};
        int[] unique = new int[arr.length];
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < size; j++) {
                if (arr[i] == unique[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                unique[size] = arr[i];
                size++;
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < size; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
