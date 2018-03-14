package programs;

public class StringRev {
	public static void main(String[] args) {
		StringBuilder strbuld=new StringBuilder("hello");
		System.out.println(strbuld.reverse());
		StringBuffer strbuff=new StringBuffer("hello");
		System.out.println(strbuff.reverse());
		String str="hello";
		String strrev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			strrev+=str.charAt(i);
		}
		System.out.println(strrev);
		
		
	}

}
