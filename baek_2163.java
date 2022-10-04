package coding22;
import java.util.Scanner;
public class baek_2163 {
	
//	static int divide(int count, int a, int b) {
//		if(a*b<=1) {
//			return count;
//		}
//		else if(a==1 && b != 1) {
//			count=count+(b-1);
//		}
//		else if(a != 1 && b == 1) {
//			count=count+(a-1);
//		}
//		else {
//			count=count+1+divide(count, a-1, int b);
//		}
//		return count;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count=0;
		for(int i=1;i<a;i++) {
			count++;
		}
		for(int i=1;i<b;i++) {
			count=count+a;
		}
		System.out.println(count);
		//System.out.println(divide(count, a, b));
		
	}

}
