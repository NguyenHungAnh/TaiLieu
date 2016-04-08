package demo.java;

public class PhanSo {
	private int Tu;
	private int Mau;
	//phuong thuc khoi tao
	public PhanSo(){
		setTu(0);
		Mau = 1;
	}
	//phuong thuc khoi tao  mdinh
	PhanSo(int tu, int mau){
		this.setTu(tu);
		if(mau == 0)
		{
			//loi
			this.Mau=1;
		}
		else
			this.Mau=mau;
	}
	
	
	public int getTu() {
		return Tu;
	}
	public void setTu(int tu) {
		this.Tu= tu;
	}
	public int getMau() {
		return Mau;
	}
	public void setMau(int mau) {
		if(Mau == 0)
		{
			System.out.println("Erro");
		}
		this.Mau=mau;
	}
	//method
	PhanSo Cong(PhanSo b)
	{
		PhanSo kq= new PhanSo();
		kq.setTu(this.getTu()*b.Mau +this.Mau * b.getTu());
		kq.Mau=this.Mau*b.Mau;
		return kq;
	}
	PhanSo Tru(PhanSo b)
	{
		PhanSo kq=new PhanSo();
		kq.setTu(this.Tu*b.Mau - this.Mau *b.getTu());
		kq.Mau=this.Mau*b.Mau;
		return kq;
	}
	PhanSo Nhan(PhanSo b)
	{
		PhanSo kq= new PhanSo();
		kq.setTu(this.Tu*b.Tu);
		kq.Mau=this.Mau*b.Mau;
		return kq;
	}
	PhanSo Chia(PhanSo b)
	{
		PhanSo kq = new PhanSo();
		kq.setTu(this.Tu*b.Mau);
		kq.Mau=this.Mau*b.Tu;
		return kq;
	}
	public static int  UCLN(int a, int b)
	{
		if(a<0)
		{
			a=-a;
		}
		if(b<0)
		{
			b=-b;
		}
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else b=b-a;
		}
		return a+b;
	}
	public PhanSo RutGon(PhanSo a)
	{
		int temp=UCLN(Tu,Mau);
		a.Tu=a.Tu/temp;
		a.Mau=a.Mau/temp;
		return a;
	}
	void Xuat(){
		System.out.println(getTu()+"/"+ Mau);
	}
}
