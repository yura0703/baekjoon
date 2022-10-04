package coding22;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class baek_9506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		int check=sc.nextInt();
		StringBuffer st=new StringBuffer("");
		while(check != -1) {
			list.add(1);
			for(int i=2;i<check;i++) {
				if(check%i==0) {
					list.add(i);
				}
			}
			int sum=0;
			for(int i=0;i<list.size();i++) {
				sum=sum+list.get(i);
			}
			if(check==sum) {
				st.append(check+" = 1");
				for(int i=1;i<list.size();i++) {
					st.append(" + "+list.get(i));
				}
				st.append("\n");
			}
			else {
				st.append(check+" is NOT perfect.\n");
			}
			list.clear();
			check=sc.nextInt();
		}
		System.out.println(st.toString());
	}

}
