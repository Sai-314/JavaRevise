package Practice;

public class DuplicateNumCheck {

    public static void main(String[] args) {
        int arr [] = new int[]{1,2,3,3,3,3,3,3,4,5,6};
        int index=0;
       for(int i=0;i<arr.length;i++) {
//            if (index== arr.length-1) {
//                arr=createAndCopyArr(arr,5);
//            }
           boolean isElementPresent = isElementExists(arr, i);
           if (!isElementPresent) {
               arr[index] = i;
               index++;
           }

       }
        display(arr);
    }

    private static boolean isElementExists(int[] arr, int x) {
        for (int i =0 ;i <arr.length; i++){
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }

    private static void display(int[] arr) {
        for (int x: arr) {
            System.out.println(x);
        }
    }

//    public static int[] createAndCopyArr(int[] arr, int z){
//        int newArr [] = new int[arr.length + z];
//        for (int i=0;i< arr.length;i++){
//            newArr[i]=arr[i];
//        }
//        return newArr;
//    }
}


