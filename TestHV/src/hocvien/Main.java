package hocvien;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try 
	        { 
	            final int max = 100; 
	            SinhVien[] sinhVien = new SinhVien[max]; 
	            Scanner input = new Scanner(System.in); 
	            Count n = new Count(); 
	            int selected; 
	             
	          
	                        
	            do 
	            { 
	                printMenu(); 
	                System.out.print("\nBạn nhập vào chức năng: "); 
	                selected = input.nextInt(); 
	                System.out.flush();                 

	                switch(selected) 
	                { 
	                    case 1: 
	                    { 
	                        System.out.print("\n1. Xem Danh Sach Hoc Vien."); 
	                        File.DocFile();
	                        break; 
	                    } 
	                    case 2: 
	                    {
	                    	System.out.print("\n1. Nhập một sinh viên mới."); 
	                        ThaoTac.selectInput(sinhVien, n); 
	                        break; 
	                    } 
	                  
	                  
	                   
	                    case 3: 
	                    { 
	                        if(n.getN() == 0 ) 
	                        { 
	                            System.out.println("Chưa có sinh viên nào trong danh sách bạn hãy chọn menu 1 để nhập các thông tin cho sinh viên."); 
	                        } 
	                        else 
	                        { 
	                            System.out.print("\n7. Xóa sinh viên có mã sinh viên được nhập từ bàn phím."); 
	                            ThaoTac.removeAt(sinhVien, n); 
	                        } 

	                        break; 
	                    } 
	                    case 4:
	                    {
	                    	printMenu();
	                    	break;
	                    }
	                    
	                    case 5: 
	                    { 
	                        System.out.println("Kết thúc."); 
	                        break; 
	                    } 
	                    default: 
	                    { 
	                        System.out.println("Chương trình không có chức năng này."); 
	                        break; 
	                    } 
	                } 
	            } 
	            while(selected != 0); 
	        } 
	        catch(Exception ex) 
	        { 
	            //ex.printStackTrace(); 
	            System.err.print("Bạn nhập sai chương trình tự động kết thúc."); 
	            System.exit(0); 
	        } 
	    } 
	private static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("**************Chuong Trinh Quan Ly Hoc Vien ^_^***********");
		System.out.println("***            \t 1.Xem Danh Sach Hoc Vien             ***");
		System.out.println("***            \t 2.Them Hoc Vien                      ***");
		System.out.println("***            \t 3.Xoa Hoc Vien                       ***");
		System.out.println("***            \t 4.Xem Menu                           ***");
		System.out.println("***            \t 5.Thoat Ung Dung                     ***");
		System.out.println("*****************************************************************");
	}

}
