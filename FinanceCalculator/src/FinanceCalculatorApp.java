import java.util.Scanner;
public class FinanceCalculatorApp {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 3 values");
	double principal=scan.nextDouble();
	double time=scan.nextDouble();
	double rate=scan.nextDouble();
	FinanceCalculator calculator = new
	FinanceCalculator();
	calculator.calculateSimpleInterest(1000.0, 0.05,2.0);
	System.out.printf("%.2f\n",FinanceCalculator.calculateSimpleInterest(principal,time,rate));
	}
	
}
