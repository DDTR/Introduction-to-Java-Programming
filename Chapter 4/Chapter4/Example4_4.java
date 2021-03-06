//HexDigit2Dec
import java.util.Scanner;

public class Example4_4 {
	public static void main(String[] arg) {
		 Scanner input=new Scanner(System.in);
		 
		 System.out.print("Enter a hex digit: ");
		 String hexString=input.nextLine();
		 
		 //检查是否是一个字符输入
		 if(hexString.length()!=1) {
			 System.out.println("You must enter exactly one character");
			System.exit(1);
		 }
		 
		 char ch=Character.toUpperCase(hexString.charAt(0));
		 if(ch<='F'&&ch>='A') {
			 int value=ch-'A'+10;
			 System.out.println("The decimal value for hex digit "+
					 ch+" is "+value);
		 }
		 else if(Character.isDigit(ch)) {
			 System.out.println("The decimal value for hex digit "+
					 ch+" is "+ch);
		 }
		 else {
			 System.out.println(ch+" is an invalid input");
		 }
	}
}
