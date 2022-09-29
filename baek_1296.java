package coding22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baek_1296 {
	
	static int[] count(String b, int[] cnt){
		
		int count[]=cnt;
		for(int j=0;j<b.length();j++) {
			char a= b.charAt(j);
			switch(a) {
		    case 'L': 
		    	count[0]++;
		         break;
		    case 'O': 
		    	count[1]++;
		         break;
		    case 'V': 
		    	count[2]++;
		         break;
		    case 'E': 
		    	count[3]++;
		         break;
		    
			}
		}
		return count;
	}
	public static <String, Integer> String getKey(Map<String, Integer> map, Integer value) {
		 
        for (String key : map.keySet()) {
            if (value==map.get(key)) {
                return key;
            }
        }
        return null;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count0[]= {0,0,0,0};
		Map<String, Integer> map=new TreeMap<>();
		String do_name=br.readLine();
		count0=count(do_name, count0);
		int candidate_num= Integer.parseInt(br.readLine());
		int []pro= new int[candidate_num];
		for(int i=0; i < candidate_num ;i++) {
			int count1[]= new int[4];
			for(int j=0;j<4;j++) {
				count1[j]=count0[j];
			}
			String candidate=br.readLine();
			count1=count(candidate, count1);
			int p=((count1[0]+count1[1]) * (count1[0]+count1[2]) * (count1[0]+count1[3]) * (count1[1]+count1[2]) * (count1[1]+count1[3]) * (count1[2]+count1[3]));
			p=p%100;
			map.put(candidate, p);
			pro[i]=p;
		}
		Arrays.sort(pro);
		System.out.println(getKey(map,pro[candidate_num-1]));
	}

}
