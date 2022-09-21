package coding22;
import java.util.*;
public class baek_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<Integer>(); 
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			int num=sc.nextInt();
			set.add(num%42);
		}
		System.out.println(set.size());
	
	}


}
