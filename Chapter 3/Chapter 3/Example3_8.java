//Lottery
import java.util.Scanner;

public class Example3_8 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		//Generate a lottery number
		int lottery=(int)(Math.random()*100);
		int lotteryDigit1=lottery/10;
		int lotteryDigit2=lottery%10;
		
		System.out.print("Enter your lottery pick: ");
		int guess=input.nextInt();
		int guessDigit1=guess/10;
		int guessDigit2=guess%10;
		System.out.println("The lottery number is "+lottery);
		
		//Check the guess
		if(lottery==guess)
			System.out.println("Exact match: you win $10,000");
		else if(guessDigit1==lotteryDigit2&&guessDigit2==lotteryDigit1)
			System.out.println("Match all digits: you win $3,000");
		else if(guessDigit1==lotteryDigit1||guessDigit1==lotteryDigit2
				||guessDigit2==lotteryDigit1||guessDigit2==lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry: no match");
	}
}
