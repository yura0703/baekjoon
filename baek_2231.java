package coding22;
import java.util.ArrayList;
import java.util.Scanner;
public class baek_2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = sc.nextInt();
		int now = num-1;
		int total = 0;
		while(now > num-55) {
			String c = Integer.toString(now);
			total=now;
			for(int i = 0 ; i < c.length() ; i++) {
				char st=c.charAt(i);
				int one = st-'0';
				total = total + one;
			}
			if(total == num) {
				list.add(now);
			}
			now = now-1;
		}
		if(list.size()==0) {
			System.out.println(0);
		}
		else {
		System.out.println(list.get(list.size()-1));
		}
	}
}
