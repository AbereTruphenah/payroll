package lesson3;
import java.util.Scanner;

public class payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String b;
		String c;
		int d;
		int e;
		String f;
		int g;
		int h;
		int i;
		
		Scanner input=new Scanner(System.in);
		System.out.println("name ");
		b=input.nextLine();
		System.out.println("designation");
		c=input.nextLine();
		System.out.println("days worked");
		d=input.nextInt();
		System.out.println("payrate");
		e=input.nextInt();
		System.out.println("date");
		f=input.next();		
		System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP: ");
		a=input.nextInt();		
		System.out.println("");		
		System.out.println("                       SHREE KRISHNA CHEMIST AND DRUGGIST");
		System.out.println("                               SALARY MONTH 9 2013");
		System.out.println("");
		System.out.print("        EMP.NO:  "+a);		
		System.out.print("\t       EMP.NAME: "+b);
		System.out.println("\t\tDESIGNATION: "+c);
		System.out.print("        DAYS WORKED: "+d);
		System.out.print("\t       PAY RATE: "+e);
		System.out.println("\t\tGEN.DATE: "+f);
		System.out.println("        ________________________________________________________________________");
		System.out.println("        EARNINGS        AMOUNT(RS.)             DEDUCTIONS      AMOUNT(RS.)  ");
		System.out.println("        ________________________________________________________________________");
		System.out.print("        BASIC PAY");
		g=d*e;
		System.out.print("\t"+g);
		System.out.print("\t\t\tP.F.");
		h=g/10;
		System.out.println("\t\t"+h);
		System.out.println("");
		i=(g*20)/100;
		System.out.print("\t\t\t\t\t\tPROF.TAX");
		System.out.println("\t"+i);
		System.out.println("");
		System.out.println("        ________________________________________________________________________");
		System.out.print("        GROSS EARN.");
		System.out.print("\t"+g);
		System.out.print("\t\t\tTOTAL DEDUCT.");
		System.out.println("\t1200");
		System.out.print("\t\t\t\t\t\tNET PAY");
		System.out.println("\t\t8800");
		System.out.println("        ________________________________________________________________________");
	}

}
