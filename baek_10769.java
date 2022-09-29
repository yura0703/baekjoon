package coding22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baek_10769 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st= br.readLine();
		String hap=":-)";
		String sad=":-(";
		int hap_count=0;
		int sad_count=0;
		List<Integer> list = new ArrayList<Integer>();
		if(st.contains(hap)||st.contains(sad)) {
			for(int i=0;i < st.length();i++) {
				if(st.charAt(i)==':') {
					list.add(i);
				}
			}
			for(int i=0;i<list.size();i++) {
				if(st.length()-1-list.get(i)>=2) {
				String b=st.substring(list.get(i), list.get(i)+3);
					if(b.equals(hap)) {
						hap_count++;
					}
					else if(b.equals(sad)) {
						sad_count++;
					}
				}
			}
			if(hap_count>sad_count) {
				System.out.println("happy");
			}
			else if(hap_count<sad_count) {
				System.out.println("sad");
			}
			else{
				System.out.println("unsure");
			}
			
		}
		else {
			System.out.println("none");
		}
	}

}            
                