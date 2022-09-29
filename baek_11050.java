package coding22;

import java.util.Scanner;
public class baek_11050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int mult=1;
		int di=1;
		for(int i=n;i>k;i--) {
			mult=mult*i;
		}
		for(int i=1;i<=(n-k);i++) {
			di=di*i;
		}
		System.out.println(mult/di);
	}

}
