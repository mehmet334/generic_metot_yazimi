public class Main {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1942, 1989, 2021, 2022, 2025};
        String[] strArray = {"Ahmet", "Mehmet", "Ayşe"};
        Double[] dblArray = {1.1, 2.2, 3.3};

        printArray(intArray);
        System.out.println("----------------");
        printArray(strArray);
        System.out.println("----------------");
        printArray(dblArray);
        System.out.println("----------------");
    }
}