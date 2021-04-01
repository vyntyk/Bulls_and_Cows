import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc =new Scanner(System.in);
        String str = sc.next().toLowerCase();
        char[] strChar = str.toCharArray();
        double sumGC=0;
        for(char temp:strChar){
            if(temp=='g'|| temp=='c') sumGC++;
        }
        System.out.print((sumGC/str.length())*100);
    }
}