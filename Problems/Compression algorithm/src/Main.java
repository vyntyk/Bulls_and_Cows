import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int count = 0;
        char a = input.charAt(0);
        for (int i = 0; i < input.length(); i++) {
            count++;
            if (i==input.length() -1 || input.charAt(i) !=input.charAt(i+1)){
                System.out.print(input.charAt(i) + "" + count);
                count = 0;
            }
        }
    }
}