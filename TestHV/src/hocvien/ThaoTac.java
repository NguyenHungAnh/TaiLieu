package hocvien;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThaoTac {
	
// ham check ma sv
	 public static boolean checkID(String s) throws Exception 
	    { 
	        try 
	        { 
	            //kiểm tra xem ID có đúng định dạng không? ID chỉ chứa các ký tự từ a -> z, A -> Z và 0 -> 9 độ dài = 10 
	            if(s.matches("^[a-zA-Z](\\w{0,9})$")) 
	            { 
	                return true; 
	            } 
	            else 
	            { 
	                return false; 
	            } 
	        } 
	        catch(Exception ex) 
	        { 
	            throw ex; 
	        } 
	    } 
	
//check hoten
	  public static boolean checkFullName(String s) throws Exception 
	    { 
	        try 
	        { 
	            //kiểm tra họ tên, họ tên chỉ chứa các ký tự từ a -> z và A -> Z 
	            if(s.matches("[a-z A-Z]{5,40}")) 
	            { 
	                return true; 
	            } 
	            else 
	            { 
	                return false; 
	            } 
	        } 
	        catch(Exception ex) 
	        { 
	            throw ex; 
	        } 
	    } 

	    //Function check sex 
	    public static boolean checkSex(String s) throws Exception 
	    { 
	        try 
	        { 
	            //Kiểm tra giới tính, giới tính chỉ có thể là nam hoặc nu không phân biệt hoa thường. 
	            if(s.equalsIgnoreCase("nam") || s.equalsIgnoreCase("nu")) 
	            { 
	                return true; 
	            } 
	            else 
	            { 
	                return false; 
	            } 
	        } 
	        catch(Exception ex) 
	        { 
	            throw ex; 
	        } 
	    } 

	public static boolean checkEmail(String s) {
		// TODO Auto-generated method stub
		try {
			Pattern pattern;
		    Matcher matcher;
		    String EMAIL_PATTERN = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
		    
		    pattern = Pattern.compile(EMAIL_PATTERN);
		    matcher = pattern.matcher(s);
		    return matcher.matches();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	public static boolean checkSDT(Double sdt) {
		// TODO Auto-generated method stub
		try {
			if(sdt >=0 && sdt<= 10)
			{
				return true;
				
			}
			else 
			{
				return false;
			}
				
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
	}
	public static boolean checkDiaChi(String diachi) {
		// TODO Auto-generated method stub
		try {
			if(diachi.matches("[a-z A-Z]{5,40}")) 
            { 
                return true; 
            } 
            else 
            { 
                return false; 
            } 
		} catch (Exception e) {
			throw e;
			// TODO: handle exception
		}
	
		
	}
	public static String removeSpace(String s, boolean check) throws Exception 
    { 
        try 
        { 
            //xóa tất cả dấu cách đầu và cuối của xâu. 
            s = s.trim(); 

            //hàm xóa 2 dấu cách liền nhau trong xâu. 
            while(s.lastIndexOf("  ") != -1) 
            { 
                s = s.replaceAll("  ", " "); 
            } 

            //xóa tất cả các dấu cách còn lại trong xâu chỉ dùng với mã học sinh và giới tính. 
            if(check) 
            { 
                while(s.lastIndexOf(" ") != -1) 
                { 
                    s = s.replaceAll(" ", ""); 
                } 
            } 

            return s; 
        } 
        catch(Exception ex) 
        { 
            throw ex; 
        } 
    } 

	//chuan hoa
	public static void ChuanHoa(SinhVien temp) throws Exception
	{
		try {
			 temp.setmasv(removeSpace(temp.getMasv(), true)); 
	            temp.setHoten(removeSpace(temp.getHoten(), false)); 
	            temp.setGioitinh(removeSpace(temp.getGioitinh(), true)); 
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
//them hoc vien
	public  static void InputHV(SinhVien[] sinhvien,Count n) throws Exception
	
	{
		SinhVien temp=null;
		Scanner hocien=  new Scanner(System.in);
		int count;
		 try {
			
			 do
			 {
				 System.out.println("\n Nhap So luong hoc vien(0<n<100)");
				count=hocien.nextInt();
				 
			 }while(n.getN() <=0 || n.getN()>= 100);
			 for(int i=0 ;i<n.getN();i++)
			 {
				 System.out.println("Moi ban nhap hoc vien thu:%d"+i);
				 temp= new SinhVien();
				 do
				 {
					 temp.InputSinhVien();
					 ChuanHoa(temp);
					 if(checkIDExists(sinhvien, temp.getMasv(), i) != -1)
					 {
						 System.out.printf("\nThông báo: ma hoc vien \"%s\" đã có trong danh sách. Mời bạn nhập lại:", temp.getMasv()); 
	                    
					 }
				 }while(!checkAll(temp) || checkIDExists(sinhvien, temp.getMasv(), i) != -1);
			 }
			 File.GhiFile(sinhvien[count]);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
	private static boolean checkAll(SinhVien temp) throws Exception{
		// TODO Auto-generated method stub
		try 
        { 
            //Gọi các hàm kiểm tra tất cả dữ liệu nhập vào. 
            if(checkID(temp.getMasv()) && checkFullName(temp.getHoten()) && checkSex(temp.getGioitinh()) && checkSDT(temp.getSdt()) && checkEmail(temp.getEmail()) && checkDiaChi(temp.getDiachi())) 
            	
            { 
                return true; 	
            } 
            else 
            { 
                return false; 
            } 
        } 
        catch(Exception ex) 
        { 
            throw ex; 
        } 
	}
	//add hv
	   public static void addSinhVien(SinhVien[] sinhVien, Count n) throws Exception 
	    { 
	        Scanner input = new Scanner(System.in); 
	        SinhVien temp = null; 
	        int count, m = n.getN(); 

	        try 
	        { 
	            do 
	            { 
	                System.out.printf("Bạn nhập vào số lượng hoc viên muốn thêm (số lượng <= %d): ", 99 - n.getN()); 
	                count = input.nextInt(); 
	            } 
	            while(!(count < 99 - n.getN()) || count <= 0); 

	            n.setN(n.getN() + count); 

	            for(int i = m; i < n.getN(); i++) 
	            { 
	                System.out.println("Bạn nhập vào thông tin hoc viên thứ %d: "+i); 
	                temp = new SinhVien(); 

	                do 
	                { 
	                    temp.InputSinhVien();//1 đối tượng để chứa dữ liệu 
	                    ChuanHoa(temp);//chuẩn hóa dữ liệu. 

	                    if(checkIDExists(sinhVien, temp.getMasv(), i) != -1) 
	                    { 
	                        System.out.printf("\nThông báo: ID \"%s\" đã có trong danh sách. Mời bạn nhập lại:", temp.getMasv()); 
	                    } 
	                } 
	                while(!checkAll(temp) || checkIDExists(sinhVien, temp.getMasv(), i) != -1); 

	                sinhVien[i] = temp;//khi được chuẩn hóa và dữ liệu đúng điều kiện thì gán cho học sinh thứ i 
	            } 
	            File.GhiFile(sinhVien[count]);
	        } 
	        catch(Exception ex) 
	        { 
	            throw ex; 
	        } 
	    } 
//remove hoc vien
	   public static void removeAt(SinhVien[] sinhVien, Count n) throws Exception 
	    { 
	        Scanner input = new Scanner(System.in); 
	        String ID; 
	        int location; 

	        try 
	        { 
	            System.out.println("\nBạn nhập vào mã sinh viên cần xóa: "); 
	            ID = input.nextLine(); 
	            removeSpace(ID, true); 
	            location = checkIDExists(sinhVien, ID, n.getN());//lấy vị trí của học sinh trong danh sách có ID bằng ID nhập vào 

	            if(location >= 0) 
	            { 
	                n.setN(n.getN() - 1);//giảm số lượng học sinh đi 1 đơn vị 

	                //bắt đầu gán lại thông tin cho các học sinh từ vị trí thứ i tới n - 1. 
	                for(int i = location; i < n.getN(); i++) 
	                { 
	                    sinhVien[i] = sinhVien[i + 1]; 
	                } 

	                System.out.printf("Sinh viên có mã \"%s\" đã được xóa khỏi danh sách.", ID); 
	            } 
	            else 
	            { 
	                System.out.printf("Không có sinh viên nào có mã \"%s\".", ID); 
	            } 
	        } 
	        catch(Exception ex) 
	        { 
	            throw ex; 
	        } 
	    } 
	   public static void selectInput(SinhVien[] sinhVien, Count n) throws Exception 
	    { 
	        Scanner input = new Scanner(System.in); 
	        String Continue; 
	         
	        try 
	        { 
	            if(n.getN() > 0) 
	            { 
	                do 
	                { 
	                    System.out.print("\nTrong danh sách đã có sinh viên bạn muốn nhập lại hay tiếp tục thêm? (nhập lại: new, tiếp tục: continue, thoát: cancel): "); 
	                    Continue = input.next(); 
	                } 
	                while(!checkContinue(Continue)); 

	                if(Continue.equalsIgnoreCase("Continue")) 
	                { 
	                    addSinhVien(sinhVien, n); 
	                } 
	                else if(Continue.equalsIgnoreCase("new")) 
	                { 
	                    InputHV(sinhVien, n);
	                } 
	            } 
	            else 
	            { 
	                InputHV(sinhVien, n);
	            } 
	        } 
	        catch(Exception ex) 
	        { 
	            throw ex; 
	        } 
	    } 
	private static boolean checkContinue(String sinhvien)throws Exception{
		try 
        { 
            //Kiểm tra điểm, điểm chỉ được lơn hơn hoặc bằng 0 và nhỏ hơn hoặc bằng 10 
            if(sinhvien.equalsIgnoreCase("continue") || sinhvien.equalsIgnoreCase("new") || sinhvien.equalsIgnoreCase("cancel")) 
            { 
                return true; 
            } 
            else 
            { 
                return false; 
            } 
        } 
        catch(Exception ex) 
        { 
            throw ex; 
        } 
	}
	private static int checkIDExists(SinhVien[] sinhvien, String masv, int n) {
		// TODO Auto-generated method stub
		  try 
	        { 
	            int result = -1; 

	            if(n > 0) 
	            { 
	                for(int i = 0; i < n; i++) 
	                { 
	                    if(masv.equalsIgnoreCase(sinhvien[i].getMasv())) 
	                    { 
	                        result = i; 
	                        break; 
	                    } 
	                } 
	            } 

	            return result; 
	        } 
	        catch(Exception ex) 
	        { 
	            throw ex; 
	        } 
	}



}
