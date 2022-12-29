RoundingInt{
  /*
   整数类型的四舍五入
   传入一个数字，返回最靠近被5整除的整数
  */
 public static int quzheng(int a){

		//四舍五入

		int u=a,o=a;

		for(int i=0;i<5;i++){

			if(u%5==0){

				return u;

			}

			if(o%5==0){

				return o;

			}

			u++;o--;

		}

		return a;

	}
}
