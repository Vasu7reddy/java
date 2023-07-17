import java.util.Scanner;
public class HeightConverterApp {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter feet number");
	double inches=scan.nextDouble();
	HeightConverter converter = new HeightConverter();
	converter.convertInchesToFeet(72.0);
	System.out.printf("%.2f\n",HeightConverter.convertInchesToFeet(inches));
	
	}
	
}
