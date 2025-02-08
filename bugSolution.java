public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 5 && 5 >=0 ) {
            System.out.println(arr[5]);
        }else{
            System.out.println("Array index out of bounds");
        }
    }
}