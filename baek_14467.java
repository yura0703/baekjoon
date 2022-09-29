package coding22;

import java.util.Scanner;

public class baek_14467 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cow=sc.nextInt();
		char[] record=new char[cow+1];
		int count=0;
		for(int i=0; i<cow;i++) {
			int cow_num=sc.nextInt();
			String cow_place=sc.next();
			int st=record[cow_num]-cow_place.charAt(0);
			record[cow_num]=cow_place.charAt(0);
			if(st==-1) {
				count++;
			}
			else if(st==1) {
				count++;
			}
			else if(st==0) {
				continue;
			}
		}
		System.out.println(count);
	}
		
}
출처: https://declare0703.tistory.com/45 [이것저것 공부:티스토리]
