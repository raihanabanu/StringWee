# StringWee
import java.util.Scanner;


public class WeekingDay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.equalsIgnoreCase("Sunday")){
			System.out.println(false);
		}
		else{
			System.out.println(true);
		}

	}

}
