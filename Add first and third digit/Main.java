import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int n1=num/100;
      int n2=num%10;
      int n3=n1+n2;
      System.out.println(n3);
	}
}