import java.io.*;
import java.util.*;

public class ascii_value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character:");
		char ch=sc.next().charAt(0);
		int ascii=(int)ch;
		System.out.println("\n\nThe ASCII value of "+ch+" is "+ascii);
		sc.close();
	}

}
