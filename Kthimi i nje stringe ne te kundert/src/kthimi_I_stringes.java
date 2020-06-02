import java.util.Scanner;
public class kthimi_I_stringes {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1,s2;
		System.out.println("Jepni stringen qe doni te ktheni mbrapsht");
		s1=input.next();
		s2=" ";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println("Si rezultat kemi: "+s2);
	

	}

}
