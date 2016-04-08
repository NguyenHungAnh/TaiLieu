package hocvien;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;





public class File {
	static SinhVien SV = new SinhVien();
	static SinhVien[] list = new SinhVien[100];

	public static void GhiFile(SinhVien sinhVien)
	{
		try {
			//mo luong
			FileOutputStream fileOutputStream = new FileOutputStream("D:/QuanLySinhVien.txt",true);
			//ghi file
			PrintWriter pw = new PrintWriter(fileOutputStream);
			pw.println(sinhVien.getHoten());
			pw.println(sinhVien.getMasv());
			pw.println(sinhVien.getDiachi());
			pw.println(sinhVien.getEmail());
			pw.println(sinhVien.getGioitinh());
			pw.println(sinhVien.getSdt());
		
			pw.close();
			//dong luong
			fileOutputStream.close();
		} catch (IOException io) {
			System.out.println("Xuat hien loi"+io.getMessage());
			
		}
		finally{
			System.out.println("Ghi file thanh cong");
		}
	}

public  static void DocFile()
{
	
	try {
		int count=1;
		// mo luong
		
		FileReader fileReader = new FileReader("D:/QuanLySinhVien.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		bufferedReader.readLine();
		while(bufferedReader.readLine()!= null)
		{
			count++;
		}
		SV.setSL(count/7);
		bufferedReader.close();
		fileReader.close();
		FileReader fileReader2 = new FileReader("D:/QuanLySinhVien.txt");
		BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
		for(int i=1;i<SV.getSL();i++)
		{
			list[i]  = new SinhVien();
			list[i].setmasv(bufferedReader2.readLine());
			list[i].setHoten(bufferedReader2.readLine());
			list[i].setGioitinh(bufferedReader2.readLine());
			list[i].setDiachi(bufferedReader2.readLine());
			list[i].setEmail(bufferedReader2.readLine());
			list[i].setSdt(bufferedReader2.read());
			
		}
		// dong luong
	} catch (FileNotFoundException fe) {
		// TODO Auto-generated catch block
		
		System.out.println("Xuat hien loi: “+fe.getMessage()");
	}catch (IOException io) {
		// TODO: handle exception
		System.out.println("Xuat hien loi: “+io.getMessage()");
	}
}
}
