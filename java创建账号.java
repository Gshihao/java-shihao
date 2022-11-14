String account="2021";

	   for(int i=0;i<8;i++){			  Random ui=new Random();

			  int kl=ui.nextInt(10);

			  /*

			   获取10以内的一位数字

			  */

			  account+=String.valueOf(kl);

			  //String.valueOf(int)可以将int类型转化成字符串

	   }

	   System.out.println(account);
