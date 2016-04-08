import java.util.Scanner;

public class Bai1 {

	
	private static Scanner keyboard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap N:=");
		keyboard = new Scanner(System.in);
//		int N = keyboard.nextInt();
//		float N = keyboard.nextInt();
		long N = keyboard.nextLong();
		System.out.println("Gia Tri N:=");
		System.out.print(N);
		Fibonacci(N);
//		kiemtrahoanhao(N);
//		ktdoixung(N);
//		kiemtralapphuong(N);
//		kiemtrachinhphuong(N);
		/*int nam=2016;
		kiemtranamnhuan(nam);*/
	
		
		/*if(N > 0)
		{
		if(kiemtrasonguyento(N) ==1 )
		{
			System.out.print(N+  "la so nguyen to");
		
		}
		else
			System.out.print(N+ "khong phai  la so nguyen to");
			
		}*/
		
	}
	
	/*public static int kiemtranamnhuan(int nam)
	{
		if((nam % 400 ==0)||(nam %4 ==0 && nam % 100 != 0))
		{
			System.out.println("Nam nhuan");
		}
		else
			System.out.println("Nam khong nhuan");
		return nam;
	}*/
	/*public static int kiemtrasonguyento(int n)
	{
		int dem=0;
		for(int i=1;i<=n;i++)
		{
			if( n%i ==0)
			{
				dem++;
			}
			
		}
		if(dem ==2)
			return 1;
		return 0;
		
	}*/
/*	public static double kiemtrachinhphuong(double n)
	{
		double x=Math.sqrt(n);
		if(Math.round(x) == x)
		{
			System.out.println("SO CHinh Phuong");
		}
		else
			System.out.println("khong SO CHinh Phuong");
		return n;
		
		  	
	}*/
	/*public static double kiemtralapphuong(float n)
	{
		float x = (float) Math.pow(n, 1/3);
		if(Math.round(x) == x)
		{
			System.out.println(" SO lap Phuong");
		}
		else
			System.out.println("khong SO lap Phuong");
		return x;
	}*/
	/*public static int  ktdoixung( int n)
	{
		if(sodao(n)==n)
		{
			System.out.println("sodao");
		}
		else 
			System.out.println("k phai la so dao");
		return n;
		
	}
	public static int sodao(int n)
	{
		int sodao =0 ;
		while(sodao>0)
		{
			sodao = sodao*10 + n%10;
			n=n/10;
		}
		return sodao;
	}*/
//	public static int kiemtrahoanhao(int n)
//	{
//		int i=1,sum=0;
//		while(i<n)
//		{
//			if((n%i==0))
//			{
//				sum+=i;
//			}
//			i++;
//		}
//		if(sum==n)
//		{
//			System.out.println("So Hoan Hao");
//		}
//		else 
//		 System.out.println("khong la so hoan hao");
//		return n;
//	}
	public static long Fibonacci(long n)
	{
		int F1=0,F2=1,Fi;
		Fi=F2;
		for(int i=1;i<=n;i++)
		{
			System.out.println("  "+Fi);
			Fi=F1+F2;
			F1=F2;
			F2=Fi;
		}
		return Fi;
	}
}
;
