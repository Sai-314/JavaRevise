package Arrays;

public class ArrayOrderApproach1 {

    int arr[] = new int[5];
    int cursor = -1;

    public int add(int a) {
        if (cursor < arr.length - 1) {
            cursor++;
            arr[cursor] = a;
        }
        return a;
    }

    public int remove() {
        int r = 0;
        if (cursor >= 0) {
            r = arr[cursor];
            cursor--;
        }
        return r;
    }

    public static void main(String[] args) {
        ArrayOrderApproach1 ao1 = new ArrayOrderApproach1();

        int a1 = ao1.add(10);
        int a2 = ao1.add(30);
        int a3 = ao1.add(60);
        int r1 = ao1.remove();
        int a4 = ao1.add(80);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(r1);

    }

}
