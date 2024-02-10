
package hosptialmanagmentsystem;

import java.util.Calendar;
import java.util.Scanner;
import test.Doctor;
import test.Facility;
import test.Laboraties;
import test.Patients;
import test1.Staff;
import test.Medicine;


public class HosptialManagmentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
		Calendar calendar = Calendar.getInstance();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("\n--------------------------------------------------------------------------------");
		System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " "
				+ calendar.get(Calendar.YEAR));
		System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE)
				+ ":" + calendar.get(Calendar.SECOND));
		int j;
		Doctor d[] = new Doctor[100];
		for (j = 0; j < 100; j++) {
			d[j] = new Doctor();
		}
		Patients p[] = new Patients[100];
		for (j = 0; j < 100; j++) {
			p[j] = new Patients();
		}
		Laboraties lab[] = new Laboraties[100];
		for (j = 0; j < 100; j++) {
			lab[j] = new Laboraties();
		}
		Staff s[] = new Staff[100];
		for (j = 0; j < 100; j++) {
			s[j] = new Staff();
		}
		Medicine med[] = new Medicine[100];
		for (j = 0; j < 100; j++) {
			med[j] = new Medicine();
		}
		Facility f[] = new Facility[100];
		for (j = 0; j < 100; j++) {
			f[j] = new Facility();
		}
		int choice, i, status = 1;
		int count = 0;
		while (status == 1) {
			System.out.println("\n                                    MAIN MENU");
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
			System.out.println("-----------------------------------------------------------------------------------");
			choice = input.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                      **DOCTOR SECTION**");
				System.out.println("--------------------------------------------------------------------------------");
				int s1 = 1;
				while (s1 == 1) {
					System.out.println("1.Add new Doctor\n 2.Existing Doctors List\n");
					int c1 = input.nextInt();
					switch (c1) {
					case 1: {
						d[count].new_doctor();
						count++;
						break;
					} // end of inner switch case 1
					case 2: {
						System.out.println(
								"--------------------------------------------------------------------------------");
						System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
						System.out.println(
								"--------------------------------------------------------------------------------");
						for (i = 0; i < count; i++) {
							d[i].doctor_info();
						}
						break;
					} // end of inner switch case 2

					}// end of inner switch
					System.out.println("\n return to back press 1 and for main menu press 0");
					s1 = input.nextInt();
				} // end of while loop
				break;
			} // end of outer switch case 1

			case 2: {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                     **PATIENT SECTION**");
				System.out.println("--------------------------------------------------------------------------------");
				int s2 = 1;
				while (s2 == 1) {
					System.out.println("1.Add new Patient\n 2.Existing patient list\n");
					int c1 = input.nextInt();
					switch (c1) {
					case 1: {
						p[count].new_patient();
						break;
					} // end of inner switch case 1
					case 2: {
						System.out.println(
								"--------------------------------------------------------------------------------");
						System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
						System.out.println(
								"--------------------------------------------------------------------------------");
						for (i = 0; i < count; i++) {
							p[i].patient_info();
						}
						break;
					} // end of inner switch case 2
					}// end of inner switch
				} // end of while loop
				System.out.println("\n return to back press 1 and for main menu press 0");
				s2 = input.nextInt();
				break;
			} // end of outer switch case 2
			case 3: {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                     **MEDICINE SECTION**");
				System.out.println("--------------------------------------------------------------------------------");
				int s3 = 1;
				while (s3 == 1) {
					System.out.println("1.Add new enter 2.Existing  medicines llist");
					int c1 = input.nextInt();
					switch (c1) {
					case 1: {
						med[count].new_medicine();
						break;
					} // end of inner switch case 1
					case 2: {
						System.out.println(
								"--------------------------------------------------------------------------------");
						System.out.println("Name \t Company \t Expiry Date \t Cost");
						System.out.println(
								"--------------------------------------------------------------------------------");
						for (i = 0; i < count; i++) {
							med[i].medicine_info();
						}
						break;
					} // end of inner switch case 2
					}// end of inner switch
					System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
					s3 = input.nextInt();
				} // end of while loop
				break;
			} // end of outer switch case 3
			case 4: {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    **LABORATORY SECTION**");
				System.out.println("--------------------------------------------------------------------------------");
				int s4 = 1;
				while (s4 == 1) {
					System.out.println("1.Add new Laboratory\n 2.Existing Laboratories list");
					int c1 = input.nextInt();
					switch (c1) {
					case 1: {
						lab[count].new_lab();
						count++;

						break;
					} // end of inner switch case 1
					case 2: {
						System.out.println(
								"--------------------------------------------------------------------------------");
						System.out.println("Fecilities\t\t Cost");
						System.out.println(
								"--------------------------------------------------------------------------------");
						for (i = 0; i < count; i++) {
							lab[i].faci_list();
						}
						break;
					} // end of inner switch case 2
					}// end of inner switch
					System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
					s4 = input.nextInt();
				} // end of while loop

				break;
			} // end of outer switch case 4
			case 5: {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("          **HOSPITAL FACILITY SECTION**");
				System.out.println("--------------------------------------------------------------------------------");
				int s5 = 1;
				while (s5 == 1) {
					System.out.println("1.Add new  Facility\n 2. Existing Facilities list\n");
					int c1 = input.nextInt();
					switch (c1) {
					case 1: {
						break;
					} // end of inner switch case 1
					case 2: {
						System.out.println(
								"--------------------------------------------------------------------------------");
						System.out.println("Hospital  Facility are:");
						System.out.println(
								"--------------------------------------------------------------------------------");
						for (i = 0; i < count; i++) {
							f[i].add_face();
						}
						break;
					} // end of inner switch case 2
					}// end of inner switch
					System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
					s5 = input.nextInt();
				} // end of while loop
				break;
			} // end of outer switch case 5
			case 6: {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                       **STAFF SECTION**");
				System.out.println("--------------------------------------------------------------------------------");
				int s6 = 1;
				while (s6 == 1) {
					String a = "nurse", b = "worker", c = "security";
					System.out.println(
							"1.Add new Staff\n 2. Existing Nurse list\n 3.Existing Worker list\n 4.Existing Security list\n");
					int c1 = input.nextInt();
					switch (c1) {
					case 1: {
						s[count].new_staff();
						count++;
						break;
					} // end of inner switch case 1
					case 2: {
						System.out.println(
								"--------------------------------------------------------------------------------");
						System.out.println("id \t Name \t Gender \t Salary");
						System.out.println(
								"--------------------------------------------------------------------------------");
						for (i = 0; i < count; i++) {
							s[i].staff_info();
						}
						break;
					} // end of inner switch case 2
					case 3: {
						System.out.println(
								"--------------------------------------------------------------------------------");
						System.out.println("id \t Name \t Gender \t Salary");
						System.out.println(
								"--------------------------------------------------------------------------------");
						for (i = 0; i < count; i++) {
							s[i].staff_info();
						}
						break;
					} // end of inner switch case 3
					case 4: {
						System.out.println(
								"--------------------------------------------------------------------------------");
						System.out.println("id \t Name \t Gender \t Salary");
						System.out.println(
								"--------------------------------------------------------------------------------");
						for (i = 0; i < count; i++) {
							s[i].staff_info();
						}
						break;
					} // end of inner switch case 4
					}// end of inner switch
					System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
					s6 = input.nextInt();
				} // end of while loop
				break;
			} // end of outer switch case 6
			default: {
				System.out.println(" You Have Enter Wrong Choice!!!");
				break;
			}

			}
			// end of outer switch
			System.out.println("\nReturn to MAIN MENU Press 1");
			status = input.nextInt();
		}

	}

}
