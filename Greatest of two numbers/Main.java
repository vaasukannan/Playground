import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		int a, b, big;
        Scanner scan = new Scanner(System.in);
		
        
        a = scan.nextInt();
        b = scan.nextInt();
		
        if(a>b)
        {
           System.out.print("num1 is the greatest number");
        }
       
        else
        {
           System.out.print("num2 is the greatest number");
        }
		
        
	}
}