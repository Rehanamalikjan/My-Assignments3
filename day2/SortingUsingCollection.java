package week3.day2;

import java.util.Arrays;

public class SortingUsingCollection {
public static void main(String[] args) {
	String[] companies = {"Google,Microsoft,TestLeaf,Maveric"};
	
	int length = companies.length;
	Arrays.sort(companies);
	for (int i = length - 1; i >= 0; i--) {
		 System.out.print(companies[i]);
		 if (i > 0) {
		        System.out.print(", ");
	}
	
}
}

}

