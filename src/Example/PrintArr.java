package Example;

public class PrintArr {
    private static void printArr(Object[] arr) {
        // System.out.println("#1");

        for (Object obj : arr)
            System.out.print(obj + " ");
    }

    public static void printArr(int[] arr) {
        //System.out.println("#2");
        Integer[] objArr = new Integer[arr.length];
        for (int i = 0; i < objArr.length; i++)
            objArr[i] = arr[i];
        printArr(objArr);
    }

    public static void printArr(Object arr) {
        //System.out.println("#3");
        //System.out.println(arr.getClass().toString().split(" ")[0].equals("class"));
        //System.out.println(arr.getClass().toString().split(" ")[1].split("")[0].equals("["));
        if (arr.getClass().toString().split(" ")[1].split("")[0].equals("[")) {
            try {
                Object[][] c = (Object[][]) arr;
                for (Object[] objArr : c) {
                    printArr(objArr);
                    System.out.println();
                }

            } catch (ClassCastException e) {
                if (e.getMessage().split(" ")[1].equals("[[I"))
                    for (int[] intArr : (int[][]) arr) {
                        printArr(intArr);
                        System.out.println();
                    }
            }
        }
    }

}
