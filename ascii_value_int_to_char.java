import java.io.*;
import java.util.*;

public class ascii_value_int_to_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer:");
		int ascii=sc.nextInt();
		char ch=(char)ascii;
		System.out.println("\n\nThe output is "+ch);
		sc.close();
	}

}
