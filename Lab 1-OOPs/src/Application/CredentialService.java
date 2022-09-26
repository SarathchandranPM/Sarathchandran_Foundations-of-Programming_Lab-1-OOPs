package Application;

import java.util.Random;
import java.util.Scanner;

public class CredentialService {
	static String first_name;
	static String last_name;
	static int department;
	final static String COMPANY_NAME = "abcd";
	static Scanner sc = new Scanner(System.in);

	CredentialService(String first_name, String last_name, int department) {
		generateEmailAddress();
		generatePassword();
		showCredentials();
	}

	public void generateEmailAddress() {
		System.out.println("Enter the First Name of the Employee");
		first_name = sc.nextLine();
		System.out.println();
		System.out.println("Enter the Last Name of the Employee");
		last_name = sc.nextLine();
		System.out.println();
		System.out.println("Select the Depratment of the employee:\n1.Technical\n2.Admin\n3.Human Resource\n4.Legal\n");
		System.out.println("Enter 1 for Technical\nEnter 2 for Admin\nEnter 3 for Human Resource\nEnter 4 for Legal");
		department = sc.nextInt();
		System.out.println();
	}
	public void generatePassword() {
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyzz";
		String specialChar = "!@#$%^&*";
		String number = "0123456789";
		String addValues = upperCase + lowerCase + specialChar + number;
		Random r = new Random();
		char[] password = new char[8];
		password[0] = upperCase.charAt(r.nextInt(upperCase.length()));
		password[1] = lowerCase.charAt(r.nextInt(lowerCase.length()));
		password[2] = specialChar.charAt(r.nextInt(specialChar.length()));
		password[3] = number.charAt(r.nextInt(number.length()));
		System.out.println("Password of the empployee: ");

		for (int i = 4; i < password.length; i++)
			password[i] = addValues.charAt(r.nextInt(addValues.length()));
		for (char element : password)
			
			System.out.println(element);

	}

	public void showCredentials() {
		if (department < 1) {
			System.out.println("Invalid selection!!!");
			System.exit(department);
		}
		if (department > 4) {
			System.out.println("Invalid Selection!!!");
			System.exit(department);
		}
		if (department == 1) {
			System.out.println(
					"E-main ID of the employee: " + first_name + last_name + "@" + "tech." + COMPANY_NAME + ".com");
		}

		if (department == 2) {
			System.out.println(
					"E-mail ID of the employee: " + first_name + last_name + "@" + "admin." + COMPANY_NAME + "com");
		}

		if (department == 3) {
			System.out.println(
					"E-main ID of the employee: " + first_name + last_name + "@" + "hr." + COMPANY_NAME + ".com");
		}

		if (department == 4) {
			System.out.println(
					"E-main ID of the employee: " + first_name + last_name + "@" + "legal." + COMPANY_NAME + ".com");
		}

	}

	public static void main(String[] args) {
		CredentialService employee1 = new CredentialService(first_name, last_name, department);

	} 

}
