public class ReverseArray {
//   Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
//Test Data:
//{2, 7, 3, 10} → {10, 3, 7, 2}


    public int[] reverseArrayAlgorithm(int[] name) {
        if (name.length > 0) {
            int temp;
            int index = name.length - 1;
            for (int i = 0; i < name.length / 2; i++) {
                temp = name[i];
                name[i] = name[index];
                name[index] = temp;
                index--;
            }
            return name;
        }

        return new int[]{};
    }
}

