import java.util.*;

class Staff
{
   public String name;
   public int code;
}
class Teacher extends Staff
{
   public String subject;
   public int experience;

   public void read()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the details");
       
       System.out.print("enter name ");
       name = sc.next();
       
       System.out.print("enter the code ");
       code = sc.nextInt();
       
       System.out.print("enter the subject ");
       subject = sc.next();
       
       System.out.print("enter your experience ");
       experience = sc.nextInt();
    }

    public void display()
    {
        System.out.println("following are details of teacher "+"name: "+name+" code: "+code+" subject: "+subject+" experience: "+experience);
    }
}
class Officer extends Staff
{
      public String department;
      public int grade;

      public void read()
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the details");
       
          System.out.print("enter name ");
          name = sc.next();
       
          System.out.print("enter the code ");
          code = sc.nextInt();
       
          System.out.print("enter the department ");
          department = sc.next();
       
          System.out.print("enter your grade ");
          grade = sc.nextInt();
      }

      public void display()
    {
        System.out.println("following are details of officer "+"name: "+name+" code: "+code+" department: "+department+" grade: "+grade);
    }
} 

class Typist extends Staff
{
   public int speed;
   public int experience;
}

class Regular extends Typist
{
   public int salary;
   
   public void read()
   {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the details");
       
          System.out.print("enter name ");
          name = sc.next();
       
          System.out.print("enter the code ");
          code = sc.nextInt();
       
          System.out.print("enter the speed ");
          speed = sc.nextInt();
       
          System.out.print("enter your experience ");
          experience = sc.nextInt();

          System.out.print("enter your salary ");
          salary = sc.nextInt();          
   }

   public void display()
    {
        System.out.println("following are details of regular typist "+"name: "+name+" code: "+code+" speed: "+speed+" experience: "+experience+" salary: "+salary);
    }
}

class Adhoc extends Typist
{
   public int salary;
   public int hours;
   
   public void read()
   {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the details");
       
          System.out.print("enter name ");
          name = sc.next();
       
          System.out.print("enter the code ");
          code = sc.nextInt();
       
          System.out.print("enter the speed ");
          speed = sc.nextInt();
       
          System.out.print("enter your experience ");
          experience = sc.nextInt();

          System.out.print("enter your salary ");
          salary = sc.nextInt();   
 
          System.out.print("enter your hours ");
          hours = sc.nextInt();          
   }

   public void display()
    {
        System.out.println("following are details of Ad-Hoc typist "+"name: "+name+" code: "+code+" speed: "+speed+" experience: "+experience+" salary: "+hours*salary);
    }
}
  

class actual
{
    public static void main(String[] args)
    {
        System.out.println("1.Teacher 2.Officer 3.Regular Typist 4.Ad-Hoc 5.Exit");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        
        do
      {
        switch(op)
        {
        case 1:
        Teacher t = new Teacher();
        t.read();
        t.display();
        break;
     
        case 2:
        Officer o = new Officer();
        o.read();
        o.display();
        break;

        case 3:
        Regular r = new Regular();
        r.read();
        r.display();
        break;

        case 4:
        Adhoc ad = new Adhoc();
        ad.read();
        ad.display();
        break;
        }
      } while(op!=5);
    }
}
