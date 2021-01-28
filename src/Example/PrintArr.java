package Example;

public class PrintArr {


    public static void deepPrint(Object obj) {
        deepPrint(obj, 0, false);
    }

    private static void deepPrint(Object obj, int recursionLevel, boolean isLast) {
        if (obj.getClass().toString().split(" ")[0].equals("class") && obj.getClass().toString().split(" ")[1].split("")[0].equals("["))
            try {
                if (recursionLevel > 0)
                    System.out.println();
                for (int i = 0; i < recursionLevel; i++)
                    System.out.print("  ");
                System.out.print("[");
                Object[] arr = (Object[]) obj;
                for (int i = 0; i < arr.length; i++)
                    deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                if (arr.getClass().toString().split(" ")[1].split("")[1].equals("[")) {
                    System.out.println();
                    for (int i = 0; i < recursionLevel; i++)
                        System.out.print("  ");
                }
                System.out.print("]" + ((!isLast && recursionLevel > 0) ? "," : ""));
            } catch (ClassCastException e) {
                String type = obj.getClass().toString().split(" ")[1].split("")[1];
                if (type.equals("B")) {
                    byte[] arr = (byte[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("S")) {
                    short[] arr = (short[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("I")) {
                    int[] arr = (int[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("J")) {
                    long[] arr = (long[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("F")) {
                    float[] arr = (float[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("D")) {
                    double[] arr = (double[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("Z")) {
                    boolean[] arr = (boolean[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("C")) {
                    char[] arr = (char[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                }
                System.out.print("]" + ((!isLast && recursionLevel > 0) ? "," : ""));
            }
        else
            System.out.print(obj + ((!isLast && recursionLevel > 0) ? ", " : ""));
    }
}
