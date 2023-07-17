import java.util.Scanner;

	
public class PlanetExplorerApp {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter radius value");
	double radius=scan.nextDouble();
	PlanetExplorer explorer = new PlanetExplorer();
	explorer.calculateSurfaceArea(3.0);
	System.out.printf("%.2f",PlanetExplorer.calculateSurfaceArea(radius));
	}
	}

	
	

