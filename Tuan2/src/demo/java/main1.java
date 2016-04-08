package demo.java;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo a = new PhanSo(1,2);
		PhanSo b = new PhanSo(3,2);
		PhanSo kq = new PhanSo();
//		kq=a.Cong(b);
//		kq=a.Tru(b);
//		kq=a.Nhan(b);
		kq=a.Chia(b);
		kq.RutGon(kq);
		kq.Xuat();
		main1 x= new main1();
	
	}

}
