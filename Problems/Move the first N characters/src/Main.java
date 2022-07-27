import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Привет
        //4
        //етПрив
        Scanner scanner = new Scanner(System.in);

        String phrase = scanner.next();
        int shift = scanner.nextInt();

        if (shift > phrase.length()) {
            System.out.println(phrase);
        }else {
            shift %= phrase.length();
            System.out.println(phrase.substring(shift) + phrase.substring(0, shift));
        }
    }
}