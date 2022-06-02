package sample;

public class Sample01 {


	public class ArrayDemo {

		public static void main(String[] args) {

			
			int k[][]= {
							{2,4,6,8},
							{3,6,2},
							{1,2,3,4},
							{3}
			};
			
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<k[i].length;j++)
				{
				System.out.print(" "+k[i][j]);
				}
				System.out.println();
			}
		}
	}


}
