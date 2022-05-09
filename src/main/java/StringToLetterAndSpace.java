public class StringToLetterAndSpace {

    public String testStringToLettersAndSpaceAlgorithm(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) > 64 && str.charAt(i) < 91) || (str.charAt(i) > 96 && str.charAt(i) < 123) || str.charAt(i) == 32) {
                result += str.charAt(i);
            }
        }

        return result;
    }

}
