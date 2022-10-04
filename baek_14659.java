package coding22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class baek_14659 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String str=br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		List<Integer> height=new ArrayList<Integer>();
		while (st.hasMoreTokens()) {            
			height.add(Integer.parseInt(st.nextToken()));
		}
		int standard=height.get(0);
		List<Integer> delete_index=new ArrayList<Integer>();
		int count=0;
		if(height.size()>1) {
			for(int i=1;i<height.size();i++) {
				if(height.get(i)<standard) {
					delete_index.add(i);
				}
			}
			for(int i=0;i<delete_index.size();i++) {
				height.remove(height.indexOf(delete_index.get(i)));
			}
			Collections.sort(height, Collections.reverseOrder());
			standard=height.get(0);
			count=height.size();
			for(int i=1;i<height.size();i++) {
				if(standard != height.get(i)) {
					count=count-i;
					break;
				}
			}
			
			
		}
		System.out.println(count);
	}

}
