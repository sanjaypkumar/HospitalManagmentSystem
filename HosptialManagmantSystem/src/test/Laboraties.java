package test;

import java.util.Scanner;

public class Laboraties {
	String Facility;
	int lab_cost;
	public void new_lab() {
		Scanner input=new Scanner(System.in);
		System.out.println("Facility:-");
		Facility=input.nextLine();
		System.out.println("lab_cost:-");
		lab_cost=Integer.parseInt(input.nextLine());
	}
	public void faci_list() {
		System.out.println(Facility +"\t\t"+ lab_cost);

	}
}
