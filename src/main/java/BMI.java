import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lets calculate your BMI");
        System.out.println("Enter your height in cms: ");
        double height = scan.nextDouble();
        System.out.println("Enter your weight in kg: ");
        double weight = scan.nextDouble();
        System.out.println("Enter your age: ");
        double Age = scan.nextDouble();
        double BMI = (weight/Math.pow(height/100, 2));
        System.out.println("Your BMI is: " + BMI);

        if (BMI>= 30) {
            System.out.println("You are Obese");
        }

        else if ((BMI<=29.9) && (BMI>=25)){
            System.out.println("You are overweight!");
        }

        else if ((BMI<=24.9) && (BMI>=18.5)){
            System.out.println("You are healthy weight");
        }

        else if (BMI<=18.5){
            System.out.println("You are underweight");
        }

        System.out.println("Healthy weight range for your height: 47.4kg - 64kg");
    }
}
