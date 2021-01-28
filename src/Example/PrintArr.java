package Example;

public class PrintArr {
    public static void deepPrint(Object obj){
        deepPrint(obj, 0);
    }
    private static void deepPrint(Object obj, int recursionLevel) {
        if(obj.getClass().toString().split(" ")[0].equals("class") && obj.getClass().toString().split(" ")[1].split("")[0].equals("["))
            try {
                for(Object arr: (Object[])obj)
                    deepPrint(arr, recursionLevel + 1);
                System.out.println();
            }catch (ClassCastException e){
                String type = obj.getClass().toString().split(" ")[1].split("")[1];
                if(type.equals("B"))
                    for(byte arr: (byte[])obj)
                        deepPrint(arr, recursionLevel + 1);
                else if(type.equals("S"))
                    for(short arr: (short[])obj)
                        deepPrint(arr, recursionLevel + 1);
                else if(type.equals("I"))
                    for(int arr: (int[])obj)
                        deepPrint(arr, recursionLevel + 1);
                else if(type.equals("L"))
                    for(long arr: (long[])obj)
                        deepPrint(arr, recursionLevel + 1);
                else if(type.equals("F"))
                    for(float arr: (float[])obj)
                        deepPrint(arr, recursionLevel + 1);
                else if(type.equals("D"))
                    for(double arr: (double[])obj)
                        deepPrint(arr, recursionLevel + 1);
                else if(type.equals("B"))
                    for(boolean arr: (boolean[])obj)
                        deepPrint(arr, recursionLevel + 1);
                else if(type.equals("C"))
                    for(char arr: (char[])obj)
                        deepPrint(arr, recursionLevel + 1);
                System.out.println();
            }
        else
            System.out.print(obj + ", ");
    }
}
