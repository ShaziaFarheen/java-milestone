import java.util.Scanner;

public class Main

{

	public static void main(String[] args)

	{

	   	Scanner s = new Scanner(System.in);

	   	String st1,st2,st3;

	   	

	        System.out.println("enter the string1");

	        st1 = s.nextLine();

	   	System.out.println("enter the string 2");

         	st2 = s.nextLine();  
         	char[] stc1 = St1.toCharArray();
         	char[] stc2 = St2.toCharArray();
         	char[] stc3 = St3.toCharArray();
 
	   	for(int i=0;i<(st1.length()+st1.length());i++)

	   	 {

	   	   if(stc1[i] == stc2[i])

	   	   {

	   	    continue;

	   	   }

            stc3[i]=stc2[i];
	   	 }

	        System.out.println("output is"+st3);

	  }

}
