import java.util.Scanner;

public class Exercise3_6 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		//Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight=input.nextDouble();
		//Prompt the user to enter height in inches
		System.out.print("Enter feet: ");
		double feet=input.nextDouble();
		System.out.print("Enter inches: ");
		double inches=input.nextDouble();
		
		final double KILOGRAMS_PER_POUND=0.45359237;//constant
		final double METERS_PER_INCH=0.0254;//constant
		
		//Compute BMI
		double weightInKilograms=weight*KILOGRAMS_PER_POUND;
		double heightInMeters=(feet*12+inches)*METERS_PER_INCH;
		double bmi=weightInKilograms/(heightInMeters*heightInMeters);
		
		//Display result
		System.out.println("BMI is "+bmi);
		if(bmi<18.5)
			System.out.println("Underweight");
		else if(bmi<25.0)
			System.out.println("Normal");
		else if(bmi<30.0)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
			
	}
}