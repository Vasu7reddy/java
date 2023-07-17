import java.util.Scanner;

public class SecreatMessageDecoderApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Charecter");
	char ch=scan.next().charAt(0);
	SecreatMessageDecoder smd=new SecreatMessageDecoder();
	System.out.println(smd.decodeCharecter(ch));	
}
}
