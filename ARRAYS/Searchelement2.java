public class Searchelement2{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int x = 30;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Found at index: " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
}
