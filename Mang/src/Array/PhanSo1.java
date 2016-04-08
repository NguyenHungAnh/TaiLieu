package Array;

import java.util.Scanner;

public class PhanSo1 {
 private int Tu;
 private int Mau;
 //phuong thuc khoi tao
 public PhanSo1(){
	 setTu(0);
	 Mau=1;
 }
 //phuong thuc khoi tao mac dinh
 PhanSo1(int tu,int mau)
 {
	 this.setTu(tu);
	 if(mau ==0)
	 {
		 System.out.println("Loi Nhap Lai");
		 this.Mau=1;
	 }
	 else
		 this.Mau=mau;
 }
public int getTu() {
	return Tu;
}
public void setTu(int tu) {
	Tu = tu;
}
public int getMau() {
	return Mau;
}
public void setMau(int mau) {
	if(mau ==0)
	{
		System.out.println("Error");
	}
	this.Mau = mau;
}

	// TODO Auto-generated method stub
public PhanSo1 nhanHaiPhanSo(PhanSo1 b){
	PhanSo1 tichPhanSo = new PhanSo1();
	tichPhanSo.Tu = (this.Tu*b.Tu);
	tichPhanSo.Mau = this.Mau*b.Mau;
	return tichPhanSo;
}
static void congCacPhanSo(PhanSo1[] a){
	PhanSo1 tongPS = new PhanSo1();
	for(int i = 0; i < a.length; i++){
		tongPS = tongPS.congHaiPhanSo(a[i]);
	}
	tongPS.xuatPhanSo();
}
public PhanSo1 congHaiPhanSo(PhanSo1 b){
	PhanSo1 tongPhanSo = new PhanSo1();
	tongPhanSo.Tu = (this.Tu*b.Mau) + (this.Mau*b.Tu);
	tongPhanSo.Mau = this.Mau*b.Mau;
	return tongPhanSo;
}
public void NhapPS(PhanSo1[] a)
{
	
	Scanner s= new Scanner(System.in);
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Phan tu thu"+i+":");
		a[i].Tu=s.nextInt();
		a[i].Mau=s.nextInt();
	}
}
public void XuatPS(PhanSo1[] a)
{
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i].getTu()+"/"+a[i].getMau());
		
	}
}
public void xuatPhanSo(){
	if(this.Mau/UCLN(this.Tu,this.Mau) == 1)
		System.out.print(this.Tu/UCLN(this.Tu,this.Mau)+"\t");
	else
		System.out.print((this.Tu/UCLN(this.Tu,this.Mau)) +"/"+ (this.Mau/UCLN(this.Tu,this.Mau))+"\t");
}
int UCLN(int a, int b){
	a = Math.abs(a);
	b= Math.abs(b);
	if(a == 0 || b == 0)
		return a+b;
	while(a != b){
		if(a > b)
			a = a - b;
		else
			b = b - a;
	}
	return a;
}
static void nhanCacPhanSo(PhanSo1[] a){
	PhanSo1 tongPS = a[0];
	for(int i = 1; i < a.length; i++){
		tongPS = tongPS.nhanHaiPhanSo(a[i]);
	}
	tongPS.xuatPhanSo();
}
}
