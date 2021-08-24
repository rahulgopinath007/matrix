
package time;

import java.io.IOException;

public class Program
{

	public static void main(String[] args) throws IOException
	{
		int[][] arr1 = new int[][]
		{{1, 3, 4},{2, 4, 3},{3, 4, 5}};
		int[][] arr2 = new int[][]
		{{1, 3, 4},{2, 4, 3},{1, 2, 4}};
		int[][] s = Sum(arr1, arr2);
		int[][] p = Product(arr1, arr2);

		System.out.println("First matrix ");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Second matrix ");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of matrices: ");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Product of matrices : ");

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(p[i][j] + " ");
			}
			System.out.println();
		}
		System.in.read();
	}
	public static int[][] Sum(int[][] arr1, int[][] arr2)
	{
		int[][] sumarray = new int[3][3];
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				sumarray[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return sumarray;

	}
	

	
	public static int[][] Product(int[][] arr1, int[][] arr2)
	{
		int[][] sumarray = new int[3][3];
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				sumarray[i][j] = arr1[j][i] * arr2[i][j];
			}
		}
		return sumarray;

	}

}

   

