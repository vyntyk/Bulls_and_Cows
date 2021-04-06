import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.
        if (x <= 0) {
             return f1(x);
        } else if (x > 0 && x < 1) {
            return f2(x);
        } else if (x >= 1) {
           return f3(x);
        }
        return f(x);
    }

    //implement your methods here
    public static double f1(double x) {
        double result1;
        result1 = (Math.pow(x, 2)) + 1;
        return result1;
    }

    public static double f2(double x) {
        double result2;
        result2 = (1 / (Math.pow(x, 2)));
        return result2;
    }

    public static double f3(double x) {
        double result3;
        result3 = (Math.pow(x, 2)) - 1;
        return result3;
    }
}
