package Array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
	/*	int a[]=new int[4];
		Main x =new Main();
		int i = 0;
	int j=0;
		x.nhap(a);
		x.xuat(a);
		x.Bai3(a, i, j);
		x.xuat(a);*/
//		int q=x.Bai5S(a, i);
//		System.out.println(q);
		/*int u=x.Bai6S(a, i);
		System.out.println(u);*/
		
		
		/*x.Bai4(a, i);
	
		x.xuat(a);*/
		/*x.Bai1(a, i, j);
		x.xuat(a);
		x.Bai21(a, i, j);
		x.xuat(a);
		x.Bai22(a, i, j);
		x.xuat(a);
		x.Bai3(a, i, j);
		x.xuat(a);*/
		
			
	}
	
	static void nhap(int a[])
	{
		Scanner s= new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Phan Tu Thu"+i+":");
			a[i]=s.nextInt();
		}
	}
	
	static void xuat(int a[]){
		//xuat
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println("");
	}
	//sap tang
	static void Swap(int[] a ,int i ,int j){
		
	                int temp=a[i]; 
	                a[i]=a[j]; 
	                a[j]=temp; 
	                	}	
	public static boolean   KTSNT(int n)
	{
		if(n<2)
		{
			return false;
		}
		for(int i=2; i<=Math.sqrt(n);i++)
		{
			if(  n % i ==0)
			{
				return false;
			}
			
		}
		return true;
		
	}
	public void Bai1(int[] a,int i,int j)
	{
		for(i=0;i>a.length;i++)
		{
			for(j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					Swap(a, i, j);
				}
			}
		}
	}
	public void Bai21(int[] a , int i ,int j)
	{
	for(i=0;i<a.length;i++)
		if(a[i] %2 ==0)
		{
			for(j=i;j<a.length;j++)
			{
				if(a[j]%2 ==0 && a[i]<a[j] && i != j)
				{
					Swap(a, i, j);
					
				}
			}
		}
	}
	public void Bai22(int[] a , int i ,int j)
	{
	for(i=0;i<a.length;i++)
		if(a[i] %2 !=0)
		{
			for(j=i;j<a.length;j++)
			{
				if(a[j]%2 !=0 && a[i]>a[j] && i != j)
				{
					Swap(a, i, j);
					
				}
			}
		}
	}
	
	public void Bai3(int[] a,int i,int j)
	{
		int n=a.length;
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				if(KTSNT(a[i]) && a[i] > a[j] && i != j)
				{
					Swap(a,i,j);
				}
			}
		}
	}
	public double KTSCP(double n)
	{
		double x=Math.sqrt(n);
		if(Math.round(x) == x)
		{
			System.out.println("SO CHinh Phuong");
		}
		else
			System.out.println("khong SO CHinh Phuong");
		return n;
		
	}
	public int Bai4(int[] a,int i)
	{
		int dem=0;
		for(i=0;i<a.length;i++)
		{
			if(KTSCP(a[i])==1 )
					{
						dem++;
					}
		}
		return 1;
	}
	public int Bai5S(int[] a,int i)
	{
		int S=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				S+=a[i];
			}
		}
		return S;
	}
	public int Bai6S(int[] a,int i)
	{
		int S=1;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				S*=a[i];
			}
		}
		return S;
	}
}
