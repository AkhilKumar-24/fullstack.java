import java.io.*;
import java.util.*;

public class round_off {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any floating number:");
		float a=sc.nextFloat();
		System.out.println("\n\nInteger: "+(int)a);
		System.out.println("Rounded-up: "+(int)Math.ceil(a));
		System.out.println("Rounded-down: "+(int)Math.floor(a));

	}

}
