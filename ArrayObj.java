//program to demonstrate array of objects
class Student
{
	String name;
	int age;
	
	Student(String n, int a)
	{
		name=n;
		age=a;
	}
}

class ArrayObj
{
  public static void main(String ar[]) 
  {
	  //creating objects into students
    Student s1=new Student("Swetha", 33);
	Student s2=new Student("Priya", 30);
	Student s3=new Student("Chandu", 32);
	Student s4=new Student("Saritha", 40);
	Student s5=new Student("Kala", 34);	
	
	//storing objects into students array
	Student students[]=new Student[5];
	students[0]=s1;
	students[1]=s2;
	students[2]=s3;
	students[3]=s4;
	students[4]=s5;
	
	//retrieve objects from array and access it's members
	for(int i=0;i<students.length;i++)
	{
		Student s= students[i];
		System.out.print(s.name);
		System.out.println(" age is " +(s.age));
	}
  }
}  