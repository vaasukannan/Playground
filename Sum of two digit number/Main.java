import java.util.*;
class Main {
	public static void main (String[] args) {
		 Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int num1=num/10;
      int num2=num%10;
      int num3=num1+num2;
      System.out.println(num3);
	}
}