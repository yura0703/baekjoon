package coding22;
import java.io.*;
import java.util.*;

public class baek_2798 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list=new ArrayList<Integer>();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());	 
		//System.out.println(n);
		//System.out.println(m);
		str = br.readLine();
		StringTokenizer st1 = new StringTokenizer(str);
		int[] card=new int [n];
		int i=0;
		//System.out.println(card.length);
		while (st1.hasMoreTokens()) {            
			card[i]=Integer.parseInt(st1.nextToken());
			i++;
		}
		Arrays.sort(card);
		int check=m;
		for(i=n-1;i>1;i--) {
			check=m;
			check=check-card[i];
			for(int j=0;j<i-1;j++) {
				check=m-card[i];
				check=check-card[j];
				if((j-i)*(j-i)<=1) break;
				for(int k=j+1;k<i;k++) {
					if(check<card[j+1]) break;
					if(check==card[k]) {
						list.add(card[i]+card[j]+card[k]);
						break;
					}
					else if(check<card[k+1] && check > card[k]) {
						list.add(card[i]+card[j]+card[k]);
						break;
					}
					else if(check > card[k]) {
						list.add(card[i]+card[j]+card[k]);
					}
						
					}
				}
			}
			
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.get(0));
	    
	}

}
출처: https://declare0703.tistory.com/44 [이것저것 공부:티스토리]