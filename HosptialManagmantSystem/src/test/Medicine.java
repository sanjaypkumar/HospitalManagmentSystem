package test;

import java.util.Scanner;

public class Medicine {
	String med_name, med_comp, med_exp;
	int count, med_cost;
	public void new_medicine() {
		Scanner input=new Scanner(System.in);
		System.out.println("mad_name:-");
		med_name=input.nextLine();
		System.out.println("mad_comp:-");
		med_comp=input.nextLine();
		System.out.println("mad_exp");
		med_exp=input.nextLine();
		System.out.println("count:-");
		count=Integer.parseInt(input.nextLine());
		System.out.println("med_cost:-");
		med_cost=Integer.parseInt(input.nextLine());

	}
	public void medicine_info() {
		System.out.println(med_name +"\t"+ med_comp +"\t"+ med_exp +"\t"+ count +"\t"+ med_cost);

	}
}
