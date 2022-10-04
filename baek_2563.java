package coding22;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baek_2563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int confetti=sc.nextInt();
		int [][]record=new int[confetti][2]; //x1,y1
		List <Integer> rebundunt=new ArrayList<Integer>();
		int [][] white= new int[100][100];
		for(int i=0;i<confetti;i++) {
			record[i][0]=sc.nextInt();
			record[i][1]=sc.nextInt();
		}
		for(int k=0; k<confetti; k++) {
			for(int y=0; y < 10; y++) { //y
				for(int x=0; x < 10; x++) { //x
					white[record[k][0]+x][record[k][1]+y]=1;
				}
			}
		}
		int area=0;
		for(int y=0; y < 100; y++) { //y
			for(int x=0; x < 100; x++) { //x
				if(white[x][y]==1) {
					area++;
				}
			}
		}
		System.out.println(area);
	}

}

