package Example;

public class PrintArr {
//    private static void printArr(Object[] arr) {
//        // System.out.println("#1");
//
//        for (Object obj : arr)
//            System.out.print(obj + " ");
//    }
//
//    public static void printArr(int[] arr) {
//        //System.out.println("#2");
//        Integer[] objArr = new Integer[arr.length];
//        for (int i = 0; i < objArr.length; i++)
//            objArr[i] = arr[i];
//        printArr(objArr);
//    }

    public static void deepPrint(Object obj) {
        //System.out.println("NAME: " + obj.getClass());
        if(obj.getClass().toString().split(" ")[0].equals("class") && obj.getClass().toString().split(" ")[1].split("")[0].equals("["))
            try {
                for(Object arr: (Object[])obj)
                    deepPrint(arr);
            }catch (ClassCastException e){
                String type = obj.getClass().toString().split(" ")[1].split("")[1];
                if(type.equals("B"))
                    for(byte arr: (byte[])obj)
                        deepPrint(arr);
                else if(type.equals("S"))
                    for(short arr: (short[])obj)
                        deepPrint(arr);
                else if(type.equals("I"))
                    for(int arr: (int[])obj)
                        deepPrint(arr);
                else if(type.equals("L"))
                    for(long arr: (long[])obj)
                        deepPrint(arr);
                else if(type.equals("F"))
                    for(float arr: (float[])obj)
                        deepPrint(arr);
                else if(type.equals("D"))
                    for(double arr: (double[])obj)
                        deepPrint(arr);
                else if(type.equals("B"))
                    for(boolean arr: (boolean[])obj)
                        deepPrint(arr);
                else if(type.equals("C"))
                    for(char arr: (char[])obj)
                        deepPrint(arr);
            }
        else
            System.out.print(obj + " ");





        //System.out.println("#3");
        //System.out.println(arr.getClass().toString().split(" ")[0].equals("class"));
        //System.out.println(arr.getClass().toString().split(" ")[1].split("")[0].equals("["));
//        if (arr.getClass().toString().split(" ")[1].split("")[0].equals("[")) {
//            try {
//                Object[][] c = (Object[][]) arr;
//
//
//                int[] itc = ( (int[])(c[0][0]) );
//
//
//
//                System.out.println("cast");
//                System.out.println( itc[0] );
//                // Если не примитивный тип
//                for (Object[] objArr : c) {
//                    printArr(objArr);
//                    System.out.println();
//                }
//
//            } catch (ClassCastException e) { // если примитивный тип
//                System.out.println("ClassCastException");
//                if (e.getMessage().split(" ")[1].equals("[[I"))
//                    for (int[] intArr : (int[][]) arr) {
//                        printArr(intArr);
//                        System.out.println();
//                    }
//
//            }
//        }
    }

}
