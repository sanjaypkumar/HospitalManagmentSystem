package test;

import java.util.Scanner;

public class Patients {
	String pid, pname, disease, sex, admit_status;
	int age;
	public void new_patient() {
		Scanner input=new Scanner(System.in);
		System.out.println("pid:-");
		pid=input.nextLine();
		System.out.println("pname:-");
		pname=input.nextLine();
		System.out.println("disease:-");
		disease=input.nextLine();
		System.out.println("sex:-");
		sex=input.nextLine();
		System.out.println("admit_status:-");
		admit_status=input.nextLine();
		System.out.println("age:-");
		age=Integer.parseInt(input.nextLine());

	}
	public void patient_info() {
		System.out.println(pid +"\t"+ pname +"\t"+ disease +"\t"+ sex +"\t"+ admit_status +"\t"+ age);
	}
}
