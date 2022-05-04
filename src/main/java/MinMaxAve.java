public class MinMaxAve {

    public int[] minMaxAveAlgorithm(int[] name, int a, int b) {
        if (name.length > 0 && a >= 0 && b >= 0 && b < name.length && a < name.length) {
            if (a > b){
                int temp;
                temp = a;
                a = b;
                b = temp;
            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            int ave = 0;
            for (int i = a; i < b + 1; i++){
                if (name[i]< min){
                    min = name[i];
                }
                if (name[i] > max){
                    max = name[i];
                }
                sum += name[i];
            }
            ave = sum/(b-a+1);
            return new int[]{min,max, ave};
        }
        return new int[]{};
    }
}
