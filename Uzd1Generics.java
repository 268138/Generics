public class Uzd1Generics {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3};
        String[] words = {"Hello", "World"};



        printArray(numbers);
        printArray(words);

    }
    public static <T> void printArray(T[] array) {
        for (T e : array) {
            System.out.println(e);
        }
    }
}
// Response
//1
//2
//3
//Hello
//World


