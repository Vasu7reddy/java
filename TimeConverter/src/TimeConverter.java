import java.util.Scanner;
public class TimeConverter {
	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number of minutes");
	double minutes=scan.nextInt();
	double hours=minToHours(minutes);
	System.out.println(hours);
	}
	public static double minToHours(double minutes)
	{
	double hours=minutes/60;
	return hours;
	}
	
}
