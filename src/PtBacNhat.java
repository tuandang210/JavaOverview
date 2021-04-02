import java.util.Scanner;
public class PtBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner sc = new Scanner((System.in));

        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        if (a!=0){
            double solution = -b/a;
            System.out.printf("Nghiệm là: %f!",solution);
        } else{
            if (b==0){
                System.out.print("Phương trình có nghiệm với mọi x");
            } else {
                System.out.print("Phương trình vô nghiệm");
            }
        }
    }
}
