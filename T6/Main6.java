package T6;
//Завдання 6 Створити метод, який приймає масив int[][] та повертає рядок цього масиву з найбільшою сумою. Повертаєме значення int[]
import java.util.Arrays;
public class Main6 {
    public static void main(String args[]) {
        int[][] arr = new int[][]{{0, 10, 2}, {4, 7, 9}, {2, 5, 6}};
        int[] sum = new int[]{0, 0, 0};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i] = sum[i] + arr[i][j];
            }
        }
        Arrays.sort(sum); // сортировка
        System.out.println (sum [2]);
    }
}