import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int room=sc.nextInt();
		int num=0;
        if(room==1){
            System.out.println(num+1);
        }
        else{
            room--;
		while(room>0) {// 1 / 2 3/ 4 5 6 /
			room=room-num*6;
			num++;
		}
		System.out.println(num);
        }
	}

}