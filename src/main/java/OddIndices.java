public class OddIndices {

//    Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}

    public int[] OddIndicesAlgorithm(int[] name) {
        if (name.length > 1) {
            int[] result = new int[name.length / 2];
            int count = 0;
            for (int i = 1; i < name.length; i += 2) {
                result[count++] = name[i];
            }
            return result;
        }
        return new int[]{};
    }
}



