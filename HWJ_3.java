/* Задание

Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение */

package Java_lessons.lesson_3.HWJ_3;
import java.util.ArrayList;
import java.util.Random;
public class HWJ_3 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = createList(20, 1, 10);
        System.out.println(myList);
        deleteEven(myList);
        System.out.println(myList);
        System.out.println("Минимальное значение: " + min(myList));
        System.out.println("Максимальное значение: " + max(myList));
        System.out.println("Среднее значение: " + average(myList));

    }
    
    static ArrayList<Integer> createList(int numberOfElements, int origin, int bound){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(new Random().nextInt(origin, bound));
        }
        return list;
    }

    static void deleteEven(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    static int min(ArrayList<Integer> list){
        int res = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < res) {
                res = list.get(i);
            }
        }
        return res;
    }

    static int max(ArrayList<Integer> list){
        int res = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > res) {
                res = list.get(i);
            }
        }
        return res;
    }

    static float average(ArrayList<Integer> list){
        int sum = 0;
        for (int x: list) {
            sum += x;
        } 
        return (float)sum / list.size();
    }

}
