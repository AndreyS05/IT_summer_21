package T4;
//Звдання 4 Створіть метод, який дозволяє знайти мін значення у масиві int[] Використайте метод Arrays.sort() для цієї роботи.
import java.util.Arrays;
public class Main4 {
    public static void main(String[] args) {
        int[] myArray = {3, 5, 6, 1, -2, 10};
        System.out.println(MinArrayValue(myArray));
    }

    public static int MinArrayValue(int[] array1)
    {
        Arrays.sort(array1);
        return array1[0];
    }
}
