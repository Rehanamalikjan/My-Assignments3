package week3.day1;

public class reverseString {
	public static void main(String[] args) {
		String CompanyName="Test Leaf";
		char[] ch = CompanyName.toCharArray();
		for(int i =ch.length-1;i>=0;i--)
				{
			System.out.println(ch[i]);
				}
		
	}

}
