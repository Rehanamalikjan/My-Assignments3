package week3.day1;

public class chrome extends Browser{
	
 public void opnincognito() {
	 System.out.println("openincognito");
	 
 }
 public void clearcache() {
	 System.out.println("clearcahe");
	 
 }

public static void main(String[]args) {
	
	chrome c=new chrome();
	c.openurl();
	c.closebrowser();
	c.clearcache();
}
	
}



