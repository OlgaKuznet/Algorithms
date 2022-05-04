public class NumberOccurrences {


    public int[][] numberOccurancesAlgorithm(int[] name) {
        int[][] resultArray = new int[name.length][2];
        int count;
        int count1 = 0;
        if (name.length > 0) {
            for (int i = 0; i < name.length; i++) {
                count = 1;
                for (int j = i + 1; j < name.length; j++) {
                    if (name[i] == name[j]) {
                        count++;
                    }
                }
                resultArray[count1][0] = name[i];
                resultArray[count1][1] = count;
                count1++;
            }

            return resultArray;
        }

        return resultArray;
    }
}
