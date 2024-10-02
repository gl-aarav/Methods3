public class Q4 {

    public static int countVowels(String str) {
        int count = 0;

        // Converting the string to lowercase to count both uppercase and lowercase vowels
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Checking if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        int vowelCount = countVowels(str);

        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}