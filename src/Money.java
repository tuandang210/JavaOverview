import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tỉ giá usd-vnd: ");

        float tiGia = sc.nextFloat();

        System.out.print("Nhập số tiền cần đổi: ");
        float money = sc.nextFloat();

        float covert = money*tiGia;

        System.out.println(covert+" Vnd");

    }
}
