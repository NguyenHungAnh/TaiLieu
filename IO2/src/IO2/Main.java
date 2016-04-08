package IO2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= IOUtils.ReadUnicodeText();
//		for(int i=0;i<s.length();i++)
//		{
//			
//			if(i%2 ==0 )
//			{
//		
//				System.out.println(s.charAt(i));
//			}	
//		}
//		for(int i=0;i<s.length();i++)
//		{
//			
//			if(i%3==0 && i%10==3 )
//			{
//		
//				System.out.println(s.charAt(i));
//			}	
//		}
//		for(int i=0;i<s.length();i++)
//		{
//			int n = 0;
//			if(KTSNT(n) ==1 )
//			{
//		
//				System.out.println(s.charAt(i));
//			}	
//		}
	}

	public  static int KTSNT(int n)
	{
	int dem=0;
	for(int i=0;i<n;i++)
	{
		if(n%i == 0)
			dem++;
	}
	if(dem==2)
		return 1;
	else 
	return 0;
	}
}
