package Example;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        printArr(arr);
    }
    public static void printArr(Object[] arr){
        for(Object obj: arr)
            System.out.print(obj + " ");
    }
//    public static void printArr(int[] arr){
//        for(int obj: arr)
//            System.out.print(obj + " ");
//    }
}
