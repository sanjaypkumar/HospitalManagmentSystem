package test;

import java.util.Scanner;

public class Facility {
	String face_name;

	public void add_face() {
		Scanner input = new Scanner(System.in);
		System.out.print("fecility:-");
		face_name = input.nextLine();
	}

	public void show_feci() {
		System.out.println(face_name);
	}
}
