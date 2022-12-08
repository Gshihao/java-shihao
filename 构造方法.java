public class Main

{

	public static void main(String[] args)	{

		/*

		 构造方法的执行过程

		 先进行父类的构造，在进行本类的成员赋值

		*/

	  Person sd=new Student("张三",18,"济南护理职业学院");

	}

}

class Person{

	String name="未命名"; //step 2

	int age=-1;

	{

		System.out.println("Start with the initialization of the Person");

	}

	Person(String name, int age){

		super();//step 1

		//step 3

		System.out.println("开始构造person(),此时this.name="+this.name+"，this.age="+this.age);

		this.name=name;

		this.age=age;

		System.out.println("person()构造完成，此时this.name="+this.name+"，this.age="+this.age);

	}

}

class Student extends Person{

	String school="未知学校";//step 2

	Student(String name,int age,String school){

		super(name,age);//step 1

		//step 3

		System.out.println("开始构造student(),此时this.name="+this.name+"，this.aga="+this.age+"，this.school="+this.school);

		this.school=school;

		System.out.println("开始构造student(),此时this.name="+this.name+"，this.aga="+this.age+"，this.school="+this.school);

	

	}

}
