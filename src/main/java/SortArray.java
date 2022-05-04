public class SortArray {
    //12.	Написать алгоритм SortArray, который принимает на вход массив целых чисел, и сортирует элементы массива в порядке возрастания.
    //Test Data:
    //{4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}

    public int[] sortArrayAlgorithm(int[] name) {
        if (name.length == 0){

            return new int[]{};
        }
        int a;
        for (int i = 0; i < name.length - 1; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i] > name[j]) {
                    a = name[i];
                    name[i] = name[j];
                    name[j] = a;
                }
            }
        }
        return name;
    }













}
