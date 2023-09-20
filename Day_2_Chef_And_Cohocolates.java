package Days45coding;
import java.util.Scanner;

public class Day_2_Chef_And_Cohocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		while(T-->0){
		    int X_rupee=s.nextInt();
		    int Y_rupee=s.nextInt();
		    int c_cost=s.nextInt();
		    
		    System.out.println(((X_rupee*5)+(Y_rupee*10))/c_cost);
		    }
}

}
