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
		List<Integer> check=new ArrayList<Integer>();
		int count=0;
		if(height.size()>1) {
			for(int i=1;i<height.size();i++) {
				if(standard>height.get(i)) {
					count++;
				}
				else{
					check.add(count);
					count=0;
					standard=height.get(i);
				}
			}
			check.add(count); //마지막 인덱스에서 standard보다 큰 값을 만나지 않는 경우, count 저장 안 됩니다~
			Collections.sort(check, Collections.reverseOrder());
			System.out.println(check.get(0));
		}
		else {
			System.out.println(count);
		}
	}

}
