import java.util.Scanner;

class ArithmeticSequence {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            {
                System.out.println("d = Common difference: ");
                int d = myObj.nextInt(); // 2 // difference

                System.out.println("n = Order of the number: ");
                int n = myObj.nextInt(); // 10 // n terms

                System.out.println("a = 1st term in the sequence: ");
                int a = myObj.nextInt(); // 1 // first term

                System.out.println("Arithmetic Sequence till " + n + "th term: ");

                for (int i = 1; i <= n; i++) {
                    if (i != n) {
                        System.out.print(a + ", ");

                        int output = a + d;
                        a = output;

                    } else {
                        System.out.print(a);
                    }

                }

            }
        }
    }

}