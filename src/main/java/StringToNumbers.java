public class StringToNumbers {

    public int[] stringToNumberAlgorithm(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                result += Character.getNumericValue(str.charAt(i));
            }
        }

        if (result.length() > 0) {
            int[] array = new int[result.length()];
            for (int i = 0; i < array.length; i++) {
                array[i] = Character.getNumericValue(result.charAt(i));

            }
            return array;
        }
        return new int[]{};

    }
}
