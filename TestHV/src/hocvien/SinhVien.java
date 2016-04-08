package hocvien;
import java.io.*; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SinhVien {
	private static String masv;
	private static String  gioitinh;
	public SinhVien(String masv,String gioitinh,String hoten,String email,Double sdt,String diachi)
	{
		this.diachi=diachi;
		this.masv=masv;
		this.gioitinh=gioitinh;
		this.email=email;
		this.hoten=hoten;
		this.sdt=sdt;
	}
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	public String getMasv() {
		return masv;
	}
	public void setmasv(String masv) {
		this.masv = masv;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public Double getSdt() {
		return sdt;
	}
	public void setSdt(int i) {
		this.sdt = sdt;
	}
	private String hoten;
	private String email;
	private String diachi;
	private Double sdt;
	private int SL;

	public int getSL() {
		return SL;
	}
	public void setSL(int sL) {
		SL = sL;
	}
	public void InputSinhVien()throws Exception
	{
		Scanner input = new Scanner(System.in);
		BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
		try {
			  do 
	            { 
	                System.out.print("\nBạn nhập vào mã sinh viên (mã không được trùng, nhỏ hơn hoặc bằng 10 ký tự và không chứa các ký tự đặc biệt): "); 
	                setmasv(bufferedReader.readLine()); 
	            } 
	            while(!ThaoTac.checkID(masv)); 

	            do 
	            { 
	                System.out.print("Bạn nhập vào họ và tên sinh viên (Lớn hơn hoặc bằng 5 ký tự): "); 
	                setHoten(bufferedReader.readLine()); 
	            } 
	            while(!ThaoTac.checkFullName(hoten)); 

	            do 
	            { 
	                System.out.print("Bạn nhập vào giới tính cho sinh viên (không được để trống, giới tính chỉ có thể là nam hoặc nữ): "); 
	                setGioitinh(bufferedReader.readLine()); 
	            } 
	            while(!ThaoTac.checkSex(gioitinh)); 

	            do 
	            { 
	                System.out.print("Bạn nhập vào Email(Email Phai Co @ va .com): "); 
	                setEmail(bufferedReader.readLine());
	            } 
	            while(!ThaoTac.checkEmail(email)); 

	            do 
	            { 
	                System.out.print("Bạn nhập vào so dien thoai (co 10 hoac 11 so va bat dau so 0): "); 
	               setSdt(bufferedReader.read());
	            } 
	            while(!ThaoTac.checkSDT(sdt)); 

	            do 
	            { 
	                System.out.print("Bạn nhập vào Dia CHi(gom so nha phuong xa quan!): "); 
	                setDiachi(bufferedReader.readLine());
	            }while(!ThaoTac.checkDiaChi(diachi));
	            System.out.flush();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	
	
}
