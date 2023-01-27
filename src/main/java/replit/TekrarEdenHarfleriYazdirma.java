package replit;

public class TekrarEdenHarfleriYazdirma {/*
Write a code that returns the duplicate chars in a String array.(interview Question)
Input :String str=“Javaisalsoeasy”
Output: [a, s]*/

    public static void main(String[] args) {
        String str = "Javaisalsoeasy";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        result += str.charAt(i);
                        break;
                    }
                }
            }
        }
    }
}
