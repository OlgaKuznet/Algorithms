public class Intersection {
    //Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив общих
    // элементов.
    //Test Data:
    //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    //{1, 2, 4, 5, 89}, {8, 9, 45} → {}

    public int[] intersectionArraysAlgorithm(int[] name1, int[] name2) {
        int count = 0;
        for (int i = 0; i < name1.length; i++) {
            for (int j = 0; j < name2.length; j++) {
                if (name1[i] == name2[j]) {
                    count++;
                }
            }
        }
        int[] resultArray = new int[count];
        int count1 = 0;
        for (int i = 0; i < name1.length; i++) {
            for (int j = 0; j < name2.length; j++) {
                if (name1[i] == name2[j]) {
                    resultArray[count1++] = name1[i];
                }
            }
        }
        return resultArray;
    }
}




