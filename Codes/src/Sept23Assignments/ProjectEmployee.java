// Assignment 4: Write a Program to calculate the project cost for employees based on employee salary & additional expenditures
                // employees can't be hired more than the overall project cost
//              e.g. project cost is 100 INR - and it already has 2 employees with salary of 50 & 30 = 80 INR,
//                  so a new hire can't have salary more than 100-80 = 20 INR



import java.util.*;
class Project
{
	String project_name="Hiring 2021";
	int total_project_cost=100;
	int emp1_salary=35;
	int emp2_salary=40;
	public int current_project_cost()
	{
		return(emp1_salary+emp2_salary);
	}
}
class Employee extends Project
{
	String emp_name;
	int emp_ctc;
	public void display()
	{
		System.out.println("Employee's Name =  " + emp_name + "\nEmplyee's Ctc =  " + emp_ctc);
	}
}
public class Main {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.emp_ctc=23;
		emp.emp_name="Varun Bhardwaj";
		emp.display();
		int remaining_amount = emp.total_project_cost - emp.current_project_cost();
		System.out.println("Project remaining budget= " + remaining_amount);
		if(emp.emp_ctc < emp.current_project_cost())
		{
			System.out.println("Employee can be hired");
		}
		else
		{
		    System.out.println("Employee can't be hired");
		}
		
	}
}