// 5Q
import java.util.Scanner;
public class num_to_word_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();//123
		
		int rev=0,sum;
		
		while(n!=0) {
			int rem=n%10;//3
			rev=rev*10+rem;
			n=n/10;
		}
		n=rev;
		while(n!=0) {
			int rem = n%10;
			switch(rem) {
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("seven");
				break;
			case 8:
				System.out.println("eight");
				break;	
			case 9:
				System.out.println("nine");
				break;
				
			}
			n=n/10;
		}
		
	}

}