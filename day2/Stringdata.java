package week3.day2;

public class Stringdata {
	public static void main(String[] args) {
		String name="Aadhaar card";
		char findchar='a';
		int count=0;
		for(int i=0;i<name.length();i++) 
		{
			
			if(name.charAt(i)==findchar) {
				count++;
			}
		}
		System.out.println(findchar + "its present:"  +count);
	}

}
