public class DefineOddEven {

    public String defineOddEvenAlgorithm(long number){
        if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE){
            if (number % 2 ==0) {

                return "Even";
            } else {

                return "Odd";
            }
        }

        return "Undefined";
    }
}
