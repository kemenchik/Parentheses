public class Convertor {

    //O(n)
    public String convertInDigits(String phoneNumber) {
        phoneNumber = phoneNumber.toUpperCase();

        StringBuilder result = new StringBuilder();
        int number = 0;

        for (int i = 0; i < phoneNumber.length(); i++) {

            char letter = phoneNumber.charAt(i);

            if (Character.isLetter(letter)) {
                number = getNumericValue(Character.toUpperCase(letter));
            }

            if (Character.isDigit(letter)) {
                number = Character.getNumericValue(letter);
            }

            if (number == 0) {
                throw new IllegalArgumentException("Invalid symbol");
            }

            result.append(number);
        }
        return result.toString();
    }

    private int getNumericValue(Character symbol) {
        switch (symbol) {
            case 'A':
            case 'B':
            case 'C':
                return 2;
            case 'D':
            case 'E':
            case 'F':
                return 3;
            case 'G':
            case 'H':
            case 'I':
                return 4;
            case 'J':
            case 'K':
            case 'L':
                return 5;
            case 'M':
            case 'N':
            case 'O':
                return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7;
            case 'T':
            case 'U':
            case 'V':
                return 8;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 9;
            default:
                return 0;
        }
    }
}