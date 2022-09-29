package coding22;
import java.util.Scanner;

public class baek_2775 {
    static int cal(int k, int n){
    	int sum = 0;
    	if(k-1==0){
           for(int i=1;i<=n;i++){
            sum=sum+i;
           }
           return sum;
        }
    	for(int i=1;i<=n;i++) {
    		sum+=cal(k-1,i);
    	}
    	return sum;
    	
    }
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int test= sc.nextInt();
		int []record=new int[test];
        for(int i=0;i<test;i++){
            int k= sc.nextInt();
            int n= sc.nextInt();
            record[i]=cal(k, n);
        }
        for(int a:record) {
        	System.out.println(a);
        }
    }
}