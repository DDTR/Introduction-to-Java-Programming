import java.util.Scanner;

public class Exercise4_8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an ASCII code:");
		int ascii=input.nextInt();
		
		System.out.println("The character for ASCII code "+ascii+" is "+
				(char)ascii);
	}
}
