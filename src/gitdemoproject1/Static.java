package gitdemoproject1;
chkstatic
{
	 static int a=0;
	 static
	 {
		 System.out.println("I m a static block");
	 }
	 chkstatic()
	 {}
		 static void disp()
		 {
			 a++;
			 System.out.println(a);
		 }
	 }

public class Static{
	 static
	 {
		 System.out.println("Static block from main");
	 }
	 System.out.println("i am an instance block");
public static void main(String[] args) {
	 System.out.println("i am main method");
	 Static se=new Static();
	 for(int i=0;i<5;i++);
}
}
