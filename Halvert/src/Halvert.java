import java.util.Scanner;
public class Halvert {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	double num=scan.nextDouble();
	double res=halfTheNumber( num);
	System.out.println(res);
	}public static double halfTheNumber(double num)
	{
	return num/2;
	}
}
