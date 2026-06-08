package pattern;
import java.util.Scanner;

public class VOWELS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("str");
		
		String str=sc.nextLine();
		int count=0;
		//str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'|ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
			String rev= " ";
			for(int j = str.length() - 1; j >= 0; j--) {
	            rev = rev + str.charAt(j);
	            }
			System.out.println(rev);
			
			
		}
		
		System.out.println("Vowels="+count);
		sc.close();
	}

}
