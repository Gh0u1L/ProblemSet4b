
// Blake Nelson //

//Not sure if it all works (I got some help from my brother, hope thats alright)//
public class ProblemSet4b
{
    // QUESTION: PALINDROME //
    public boolean isPalindrome(String str) {
    StringBuilder cleanStr = new StringBuilder();
    for (char ch : str.toLowerCase().toCharArray()) {
        if (Character.isLetter(ch)) {
            cleanStr.append(ch);
        }
    }
    int left = 0;
    int right = cleanStr.length() - 1;
    while (left < right) {
        if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
    // QUESTION: PIG LATIN TRANSLATION //
    public class PigLatinTranslator {
    public static String convert(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() > 2) {
                result.append(word.substring(1)).append(word.charAt(0)).append("ay ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}
    // QUESTION: ASCENDING NUMBERS
    public class AscendingNumbers {
    public static int countAscendingNumbers(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isAscending(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isAscending(int number) {
        String numString = String.valueOf(number);
        for (int i = 0; i < numString.length() - 1; i++) {
            if (numString.charAt(i) >= numString.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
    // QUESTION: TIMES TABLE
    public class TimesTablePrinter {
    public void timesTables(int n) {
      String largestProduct = n*n+"";
      int HighestNumber = largestProduct.length();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                 Spacing(HighestNumber, i * j);
            }
            System.out.println();
        }
    }
    void Spacing(int HighestNumber, int num) {
        String CM = num+"";
        for (int i = HighestNumber - CM.length(); i >= 0; i--) {
            System.out.print("");
        }
    }
}
}
