package coding22_2;
import java.util.Scanner;
public class baek_1173 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int m=sc.nextInt();
		int M=sc.nextInt();
		int T=sc.nextInt();
		int R=sc.nextInt();
		int move_count=0;
		int count=0;
		int now = m;
		while(move_count<N) {
			if(now+T<=M && now+T>=m) {
				now=now+T;
				move_count++;
			}
			else if (now-R>=m && now-R<=M) {
				now=now-R;
				}
			else if(now-R<m) {
				now=m;
			}
			count++;
			if(m+T>M) {
				count=-1;
				break;
			}
		}
		System.out.println(count);

	}

}
