import java.util.Scanner;

public class IsALeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập năm cần kiểm tra: ");
        int year = sc.nextInt();

        if ((year%100==0)&&(year%400==0)){
            System.out.println(year+" là năm nhuận");
        } else if ((year%4==0)&&(year%100!=0)){
            System.out.println(year+ " là năm nhuận");
        } else if ((year%100==0)&&(year%400!=0)){
            System.out.println(year+ " không phải năm nhuận");
        } else {
            System.out.println(year+ " không phải năm nhuận");
        }
    }
}
