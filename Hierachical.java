import java.util.Scanner;
// parent class
class Employee
{
Scanner person = new Scanner(System.in);
double salary,payment;
void enter()
{
System.out.println("Enter Full time Employee Starting Salary: Ksh=");
salary=person.nextDouble();
}
void input()
{
System.out.println("Enter Intern Employee Starting Salary: Ksh=");
payment=person.nextDouble();
}
}
// child class
class FullTimeEmployee extends Employee
{
void incrementSalary()
{
enter();
salary = salary + (salary * 0.50);
System.out.println("After Increment, new salary: Ksh="+salary);
}
}
// child class
class InternEmployee extends Employee
{
void incrementpayment()
{
input();
payment = payment + (payment * 0.25);
System.out.println("After Increment, new salary: Ksh="+payment);
}
public static void main(String[] args)
        {
// object created
FullTimeEmployee fulltime = new FullTimeEmployee();
InternEmployee intern = new InternEmployee();
fulltime.incrementSalary();
intern.incrementpayment();
}
}
