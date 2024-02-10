package test;

import java.util.Scanner;

public class Doctor {
	String did,dname, specialist,appointment, doc_qual;
	int droom;
	public void new_doctor() {
		Scanner input=new Scanner(System.in);
		System.out.println("Did:-");
		did=input.nextLine();
		System.out.println("dname:-");
		dname=input.nextLine();
		System.out.println("specialist:-");
		specialist=input.nextLine();
		System.out.println("appointment:-");
		appointment=input.nextLine();
		System.out.println("Qualification:-");
		doc_qual=input.nextLine();
		System.out.println("Room:-");
		droom=Integer.parseInt(input.nextLine());

	}
	public void doctor_info() {
		System.out.println(did +"\t"+ dname +"\t"+ specialist +"\t"+ doc_qual +"\t"+ droom);

	}
}
