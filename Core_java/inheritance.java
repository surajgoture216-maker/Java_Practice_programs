/*Problem Statement: Design and implement a Java application using the concept of inheritance to 
generate a payslip for an employee by collecting employee details and salary components from the 
user.*/

import java.util.Scanner;

class Employee
{
    int empId;
    String name;
    String des;
    void getData()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter designation of the emp");
        des=sc.nextLine();
        System.out.println("enter the empid");
        empId=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the emp name");
        name=sc.nextLine();
    }   
}
class Empdata extends Employee
{
    double basicsal,hra,da,pf;
    void salData()
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the basic sal");
    basicsal=sc.nextDouble();
    System.out.println("enter the hra per");
    hra=sc.nextDouble();
    System.out.println("enter the da per");
    da=sc.nextDouble();
    System.out.println("enter the pf per");
    pf=sc.nextDouble();
    }
  void displayData()
    {
      System.out.println("employee id:"+empId);
      System.out.println("employee name:"+name);
      System.out.println("employee designation:"+des);
      System.out.println("basic salary:"+basicsal);
      System.out.println("hra:"+(hra/100)*basicsal);
      System.out.println("da:"+(da/100)*basicsal);
      System.out.println("pf deduction:"+(pf/100)*basicsal);
      System.out.println("gross salary:"+(basicsal+((hra/100)*basicsal)+((da/100)*basicsal)-((pf/100)*basicsal)));
    }
}
public class inheritance {
    public static void main(String[] args) {
        Empdata obj=new Empdata();
        obj.getData();
        obj.salData();
        obj.displayData();
    }
    
}
