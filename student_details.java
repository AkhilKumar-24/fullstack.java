import java.io.*;
import java.util.Scanner;

public class student_details {
	public static void main(String[] args) {
		String name;
		int age;
		float cgpa;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name=sc.nextLine();
		System.out.println("Enter the age:");
		age=sc.nextInt();
		System.out.println("Enter the CGPA:");
		cgpa=sc.nextFloat();
		System.out.println("Enter the Grade:");
		grade=sc.next().charAt(0);
		System.out.println("\n-----------------------------------------------\n");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("CGPA: "+cgpa);
		System.out.println("Grade: "+grade);
		sc.close();
	}
}