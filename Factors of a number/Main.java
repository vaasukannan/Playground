import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner x=new Scanner(System.in);
	   
        long y=x.nextInt(),i;
        System.out.println("1");

        for( i=2;i<y;i++){
            long z=y%i;
            if(z!=0)continue;
                System.out.println(i++);

        }System.out.println(y);
      
	}
}