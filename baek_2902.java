package coding22;
import java.io.*;
import java.util.StringTokenizer;

public class baek_2902 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringBuffer initial=new StringBuffer("");
		StringTokenizer st = new StringTokenizer(str,"-");
		while(st.hasMoreTokens()) {
			String s=st.nextToken();
			initial.append(s.charAt(0));
		}
		System.out.println(initial.toString());
		
	}

}
