import java.util.Arrays;

public class NumberOccurrences {


    public int[][] numberOccurancesAlgorithm(int[] name) {
        Arrays.sort(name);
        int count = 1;
        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i] != name[j]) {
                    count++;
                    i = j;
                }
            }
        }
        if (count > 0) {
            int[][] result = new int[count][2];
            count = 1;
            int index = 0;
            for (int i = 0; i < name.length; i++) {
                for (int j = i + 1; j < name.length; j++) {
                    if (name[i] == name[j]) {
                        count++;
                        i = j;
                    } else {
                        result[index][0] = name[i];
                        result[index++][1] = count;
                        i = j;
                        count = 1;
                    }
                    if (i == name.length - 1) {
                        result[index][0] = name[i];
                        result[index++][1] = count;
                        i = j;
                    }
                }
            }
            return result;
        }
        return new int [][]{{}};
    }
}
