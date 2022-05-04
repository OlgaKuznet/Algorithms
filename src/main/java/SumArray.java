public class SumArray {

    public int sumArrayAlgorithm(int [] name){
        int sum = 0;
        for (int i = 0; i < name.length; i++){
            sum += name[i];
        }
        return sum;
    }
}
