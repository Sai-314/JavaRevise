package Practice;

public class DuplicateNumCheck1 {
    public static void main(String[] args) {
        //int arr [] = new int[5];

        int arr [] = new int[] {1,2,3,4,1,2,3,4};
        int index=0;
     //   boolean isElementPresent =  isElementExists(arr, 4);
        for(int i=1;i<arr.length;i++) {
            if (arr[i] != 2) {
                arr[index] = arr[i];
                index++;
            }
        }
            for (int x : arr) {
                System.out.println(x);

        }
    }

    private static boolean isElementExists(int[] arr, int x) {
        for (int i =0 ;i <arr.length; i++){
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }

//    private static void display(int[] arr) {
//        for (int x: arr) {
//            System.out.println(x);
//        }
//    }

//    public static int[] createAndCopyArr(int[] arr){
//        int newArr [] = new int[arr.length];
//        for (int i=0;i< arr.length;i++){
//            newArr[i]=arr[i];
//        }
//        return newArr;
//    }
}
