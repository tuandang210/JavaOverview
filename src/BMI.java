import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều cao: ");
        float height = sc.nextFloat();

        System.out.print("Nhập cân nặng: ");
        float weight = sc.nextFloat();

        float bmi = weight/(height*height);

        if(bmi<18.5){
            System.out.println("UnderWeight");
        } else if ((18.5<=bmi)&&(bmi<25.0)){
            System.out.println("Normal");
        } else if ((25.0<=bmi)&&(bmi<30.0)){
            System.out.println("OverWeight");
        } else if (30.0<=bmi){
            System.out.println("Obese");
        }
    }
}
