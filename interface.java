interface IFly {

	public void fly(); }

class Plane implements IFly

{

	@Override

	public void fly()

	{

		System.out.println("飞机在天上飞");

	}

 }

class bird implements IFly

{

	@Override

	public void fly()

	{

		System.out.println("小鸟在天空翱翔");

	}

 }

class Balloon implements IFly

{

	@Override

	public void fly()

	{

		System.out.println("气球飞上天");

	}

	

}

public class Main

{

	public static void main(String[] args)

	{

		IFly plane=new Plane();

		IFly bird=new bird();

		IFly Balloon=new Balloon();

		plane.fly();

		bird.fly();

		Balloon.fly();

	}

	

}

 
