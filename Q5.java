public class Q5 {
public static void main(String[] args) {
    printCharacters('A', 'P');
}

public static void printCharacters(char startChar, char endChar) {
    if (startChar > endChar) {
        char temp = startChar;
        startChar = endChar;
        endChar = temp;
    }

    for (char c = startChar; c <= endChar; c++) {
        System.out.print(c + " ");
    }
    System.out.println();
}
}