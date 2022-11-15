public class Arrayadmin{

	/*	 name:码农的熊

	 time:2022/11/15 19:16

	 www:https://gshihao.github.io/

	*/

	public int Arrayifmax(int[] aa){

		//获取数组中的最大值

		int aamax=aa[0];

		for(int i=0;i<aa.length;i++){

		  if(aamax<aa[i]){

			 aamax=aa[i];

		  }

		}

		return aamax;

	}

    public int Arrayifleast(int[] ab){

		//获取数组中的最小值

		int aamax=ab[0];

		 for(int i=0;i<ab.length;i++){

			 if (aamax>ab[i]){

				 aamax=ab[i];

			 } 

		 }

		return aamax;

	}

	

	public int[] ArrayStol(int[] ac){

		//从小到大排列数组

		int shout =0;

		int[] amor=new int[ac.length];

		for(int i=0;i<ac.length-1;i++){

			for(int o=i+1;o<ac.length;o++){

				if(ac[i]>ac[o]){

				  shout=ac[i];

				  ac[i]=ac[o];

				  ac[o]=shout;

				  shout=0;

				}

			}

		}

		return amor=ac;

	}

	public int[] Arraybtos(int[] ad){

		//从大到小排列数组

		int[] klo=new int[ad.length];

		int large=0;

		for(int i=0;i<ad.length-1;i++){

		 for(int x=0;x<ad.length-i-1;x++){

		  if(ad[x]<ad[x+1]){

			  large=ad[x];

			  ad[x]=ad[x+1];

			  ad[x+1]=large;

		  }

		 }

		}

		return ad;

	}

}
