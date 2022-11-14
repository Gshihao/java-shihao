public class Main

{

	public static void main(String[] args) throws ParseException	{

	   

	   String account="2021";

	   System.out.println("请输入要创建的数量");

	   Scanner ok=new Scanner(System.in);

	   int l=ok.nextInt();

	   String[] jh=new String[l];

	   //获取要创建的数量，执行for循环创建

	  for(int a=0;a<l;a++){

	   for(int i=0;i<8;i++){

			  Random ui=new Random();

			  int kl=ui.nextInt(10);

			  /*

			   获取10以内的一位数字

			  */

			  account+=String.valueOf(kl);

			  //String.valueOf(int)可以将int类型转化成字符串

	   }

	   jh[a]=account;

	   account="2021";

	   /*和开头一样，存放完数据后恢复到原来的样子*/

	  }

	   for(String y : jh){

		   //打印

		   System.out.println(y);

	   }

	}
