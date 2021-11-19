import java.util.Arrays;

// применение методов класса Arrays
public class ArraysExample {

    public static void main(String[] args) {
        // создаем массив
        Integer[] intArray = new Integer[5];
        intArray[0] = 97;
        intArray[1] = 5;
        intArray[2] = 61;
        intArray[3] = 10;
        intArray[4] = 38;
        System.out.println(Arrays.toString(intArray));

        // итерируемся по массиву с помощью foreach
        for (Integer element : intArray) {
            System.out.println(element);
        }

        // делаем клон массива
        Integer[] intArray2 = intArray.clone();

        // сравниваем массивы разными способами
        System.out.println(Arrays.compare(intArray, intArray2));
        System.out.println(Arrays.equals(intArray, intArray2));

        // сортируем элементы по возрастанию
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        // делаем копию массива с другой длиной
        Integer[] intArrayCopy = Arrays.copyOf(intArray, 3);
        System.out.println(Arrays.toString(intArrayCopy));

        // делаем новый массив из фрагмента существующего массива
        Integer[] intArraySlice = Arrays.copyOfRange(intArray, 2, 4);
        System.out.println(Arrays.toString(intArraySlice));
    }
}
