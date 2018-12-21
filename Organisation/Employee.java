package Organisation;
import java.util.Scanner;
public class Employee
{
    String Name;
    String Surname;
    String Position;
    double Salary;



        public Employee(String a, String b)
        {
            Name = a;
            Surname = b;
            Position = "Engineer";
            Salary = 30000;
        }


        public Employee(String a, String b, String c, double d)
        {
            Name = a;
            Surname = b;
            Position = c;
            Salary = d;
        }

    public String GetName()
    {
        return Name;
    }
    public void AddName()
    {
        System.out.println("Add name");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Name=s;
    }
    public String GetSurname()
    {
        return Surname;
    }
    public void AddSurname()
    {
        System.out.println("Add Surname");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Surname=s;
    }
    public String GetPosition()
    {
        return Position;
    }
    public void AddPosition()
    {
        System.out.println("Add position");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Position=s;
    }
    public double GetSalary()
    {
        return Salary;
    }
    public void AddSalary()
    {
        System.out.println("Add salary");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Salary=Double.parseDouble(s);
    }

}
