public class NegativeOnTheRight {
    //Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает массив,
    // в котором все негативные числа находятся во второй половине массива
    //Test Data:
    //{4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}

    public int[] negativeOnTheRightAlgorithm(int[] name) {
        if (name.length > 0) {
            int startIndexNeg = 0;
            for (int i = 0; i < name.length; i++) {
                if (name[i] >= 0) {
                    startIndexNeg++;
                }
            }
            int[] result = new int[name.length];
            int count = 0;
            for (int i = 0; i < name.length; i++) {
                if (name[i] < 0) {
                    result[startIndexNeg++] = name[i];
                } else {
                    result[count++] = name[i];
                }
            }

            return result;
        }
        return new int[]{};
    }

}
