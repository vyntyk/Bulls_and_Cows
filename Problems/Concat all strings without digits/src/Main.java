import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
        StringBuilder longString = new StringBuilder();
        for(String str : strings) {
            StringBuilder sb = new StringBuilder(str);

            for(int temp = 0; temp < sb.length(); temp++) {
                if(Character.isDigit(sb.charAt(temp))) {
                    sb.deleteCharAt(temp);
                }
            }
            longString.append(sb);
        }
        return longString.toString().replaceAll("[0-9]", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}