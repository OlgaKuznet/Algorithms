public class KthLargest {
    //Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k, и возвращает k-тый максимальный элемент.
    //Test Data:
    //({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
    // (12 и 12 - первый и второй самые большие элементы)

    public int kThLargestAlgorithm(int[] name, int k) {
        if (name.length > 0 && k > 0 && k < name.length + 1) {
            int indexMaxEl = 0;
            for (int j = 0; j < k; j++) {
                indexMaxEl = 0;
                for (int i = 1; i < name.length; i++) {
                    if (name[indexMaxEl] < name[i]) {
                        indexMaxEl = i;
                    }
                }
                if (j == k - 1) {

                    return name[indexMaxEl];
                } else name[indexMaxEl] = Integer.MIN_VALUE;
            }
        }
        return Integer.MIN_VALUE;
    }
}
