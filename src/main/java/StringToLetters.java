public class StringToLetters {

    public String stringToLettersAlgorithm(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) > 64 && str.charAt(i) < 91) || (str.charAt(i) > 96 && str.charAt(i) < 123)) {
                result += str.charAt(i);
            }
        }

        return result;
    }
}
