package Organisation;

import java.util.Scanner;

public class Department
{
    Employee Employees[];
    String DepartmentName;

    public Department(String name)
    {
        DepartmentName=name;
        Employees = new Employee[0];
    }

    public Department(Employee N[])
    {
        Employees = new Employee[N.length];

         for (int i = 0; i < N.length; i++)
         {
             Employees[i]=N[i];

         }

    }

    public String DepartmentGetName()
    {
        return DepartmentName;
    }

    public void DepartnmentAddName()
    {
        System.out.println("Add Department Name");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        DepartmentName=s;
    }

    public int ReturnEpmloyeesNumber()
    {

        return Employees.length;
    }

    public double ReturnEmployeesSalary()
    {
        double sum=0;
        for (int i=0; i<Employees.length; i++)
        {
            sum=Employees[i].Salary+sum;

        }
        return sum;
    }

    public double ReturnEmployeeLink()
    {
        int namen=0, surnamen=0;
        System.out.println("Add Employee Name");
        Scanner scan1 = new Scanner(System.in);
        String a = scan1.nextLine();
        System.out.println("Add Employee Surame");
        Scanner scan2 = new Scanner(System.in);
        String b = scan2.nextLine();
        for (int i=0; i<Employees.length; i++)
        {
            if( Employees[i].Name.contains(a) & Employees[i].Surname.contains(b))
            {
                namen =i;
                surnamen =i;
            }
            else
                {
                System.out.println("There is no user with such name and surname");
                }

        }
        return namen+surnamen;
    }

}
