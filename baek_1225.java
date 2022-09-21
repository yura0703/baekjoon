package coding22;
import java.io.*;
import java.util.StringTokenizer;

public class baek_1225 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A_str=st.nextToken();
		String B_str=st.nextToken();
		 
		long total=0;
		if(A_str.charAt(0)=='0' || B_str.charAt(0)=='0') {
			System.out.println(total);
		}
		else {
		for(int i=0;i<A_str.length();i++) {
			char a = A_str.charAt(i);
			int a_one = a -'0';
			//System.out.println(a_one);
			for(int j=0;j<B_str.length();j++) {
				char b =  B_str.charAt(j);
				int b_one = b-'0';
				//System.out.println(b_one);
				total = total + a_one * b_one;
				}
			}
		System.out.println(total);
		}
		}
	}

