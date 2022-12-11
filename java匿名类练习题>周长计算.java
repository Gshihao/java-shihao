/*

 SHAO 2022/12/11 17:35

 java 匿名类

 问题:

 图形(Shape)接口和它的实现类:长方形(Rectangle) 、正方形(Square)和圆形(Circle)

 要求:

   (1）每一种图形都求它的周长doublelength()。

   (2)在长方形类中定义长length、宽width两个属性;在正方形类中定义边长x;在圆形类中定义半属性径r。

   (3）在长方形类中定义带有两个参数的构造方法用于给长和宽赋值;在正方形类中定义带有一个参数的构造

       方法用于给边长赋值;在圆形类中定义一个带有一个参数的构造方法用于给半径赋值。

   (4）在测试类中定义一个方法shapeLength可以接收任意类型的图形对象,在方法内部调用图形周长方法。

   (5）在测试类中调用shapeLength方法求长方形、正方形、圆形的周长。

   (6)在主方法中定义匿名内部类作为参数传递给shapeLength方法，计算边长为5的正六边形周长。

*/

public class Main

{

	@SuppressWarnings	public static void main(String[] args)

	{

		/*

		 Shape Readable=new Rectangle(4,3);可以写成

		 Rectangle io=new Rectangle();然后再实现某一个方法

		*/

		Shape Readable=new Rectangle(4,3);

		Shape Square=new Square(4);

		Shape Circle=new Circle(4);

		

		/*以下是调用静态方法来实现 length()方法*/

		shapeLength(Readable);

		shapeLength(Square);

		shapeLength(Circle);

		shapeLength(new Shape(){

			    double I=5;

				@Override

				public double length()

				{

					System.out.println("六边形的周长是:"+I*5);

					return I*5;

				}	

		});

		/*定义一个匿名类来处理新加的6边型*/

	}

	private static void shapeLength(Shape s){

		//定义static 静态方法

		s.length();

	}

}

interface Shape{

	double length();

}

class Rectangle implements Shape //长方形

{

	private double length ;//定义长方形的宽高

	private double width;

	 Rectangle(double length,double width){

		this.length=length;

		this.width=width;

	}

	@Override//重载方法

	public double length()

	{

		double x=(this.length+this.width)*2;

		System.out.println("长方形的周长是:"+x);

		return x;

	}

}

class Square implements Shape //正方形

{

    private double x;

	Square(double x){

		this.x=x;

	}

	@Override

	public double length()

	{

		System.out.println("正方形的周长是:"+4*x);

		return 4*x;

	}

}

class Circle implements Shape

{

	private double r;

	 Circle(double r){

		this.r=r;

	}

	@Override

	public double length()

	{

		double x=2*Math.PI*r;

		//圆的周长计算公式 2πr

		System.out.println("圆的周长是:"+x);

		return x;

	}

	

}
