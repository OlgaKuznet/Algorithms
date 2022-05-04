public class SumOfTwo {

    public int[][] sumOfTwoAlgorithm(int[] name, int sum) {
        int[][] resultArray = {};
        int count = 0;
        if (name.length > 0) {
            for (int i = 0; i < name.length; i++) {
                for (int j = i + 1; j < name.length; j++) {
                    if (name[i] + name[j] == sum) {
                        count++;
                    }
                }
            }
            resultArray = new int[count][2];
            count = 0;

            for (int i = 0; i < name.length; i++) {
                for (int j = i + 1; j < name.length; j++) {
                    if (name[i] + name[j] == sum) {
                        resultArray[count][0] = name[i];
                        resultArray[count][1] = name[j];
                        count++;
                    }
                }
            }

            return resultArray;
        }

        return resultArray;
    }
}
