//Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает значения пиковых
// элементов (элементы, которые больше своих соседей).
//Test Data:
//{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

public class PeakElement {

    public int[] peakElementAlgorithm(int[] name) {
        if (name.length > 0) {
            int count = 0;
            if (name[0] > name[1]) {
                count++;
            }
            if (name[name.length - 1] > name[name.length - 2]) {
                count++;
            }
            for (int i = 1; i < name.length - 1; i++) {
                if (name[i] > name[i + 1] && name[i] > name[i - 1]) {
                    count++;
                }
            }
            int[] array = new int[count];
            int count1 = 0;
            if (name[0] > name[1]) {
                array[count1++] = name[0];
            }

            for (int i = 1; i < name.length - 1; i++) {
                if (name[i] > name[i + 1] && name[i] > name[i - 1]) {
                    array[count1++] = name[i];
                }
            }
            if (name[name.length - 1] > name[name.length - 2]) {
                array[count1] = name[name.length - 1];
            }

            return array;
        }
        return new int []{};
    }

}
