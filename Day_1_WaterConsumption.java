package Days45coding;
import java.util.Scanner;

public class Day_1_WaterConsumption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     
 //	Scanner s =new Scanner(System.in);
	int n=s.nextInt();
	int t;
	for (int i=0;i<=n ;i++ ){
	    t=s.nextInt();
	    if(t>=2000){
	   System.out.println("YES");    
	   }
	   else{
	       System.out.println("NO");
	   }
	 }
	}

}
