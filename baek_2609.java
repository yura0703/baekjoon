package coding22;

import java.util.Scanner;

public class baek_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a*b==0) {
			System.out.println(0);
			System.out.println(0);
		}
		else {
			int save=0;
			int st = (a < b) ? a : b; 
			for(int i=st;i>=1;i--) {
				if(a%i==0 && b%i==0) {
					System.out.println(i);
					save=i;
					break;
				}
			}
			st = (a < b) ? b : a; 
			int i=1;
			while(true) {
				if(save*i%a==0 && save*i%b==0) {
					System.out.println(save*i);
					break;
				}
				i++;
			}
		}
	}

}
