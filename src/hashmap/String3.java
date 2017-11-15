package hashmap;

public class String3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str="ROHINI";
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
		}
		

	}

}
