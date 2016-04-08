package Array;

import java.util.Random;
import java.util.Scanner;

public class Bai9 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhap so dong: \n");
		int n = in.nextInt();
		System.out.print("Nhap so cot: \n");
		int m = in.nextInt();
		//Tao mang
		int a[][] = new int[n][m];
		//random gia tri cac phan tu trong mang
		Random random = new Random();
				
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				a[i][j] = random.nextInt(100);
			}
		}
		
		XuatMang(a, n, m);
		System.out.println("\nSau khi sap xep: ");
		Swap(a, n, m);
		XuatMang(a,n,m);
	}
static void XuatMang(int a[][],int n,int m)
{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			System.out.println(a[i][j]+"\t");
		}
	}
}
//sap xep tang dan theo tug dong
static  void Swap(int a[][],int dong ,int cot)
{
	for(int i = 0; i < dong; i++){
		for(int j = 0; j < cot - 1; j++){
			for(int k = j + 1; k < cot; k++){
				if(a[i][j] > a[i][k]){
					int tmp = a[i][j];
					a[i][j] = a[i][k];
					a[i][k] = tmp;
				}
			}
		}
	}
}
}
