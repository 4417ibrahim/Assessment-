import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String :");
String str=sc.next();
String str1=" ";
char ch;

System.out.println("The Original String is : "+str);
int n= str.length();
for(int i=n;i>0;--i)
{ 
	
 ch=str.charAt(i-1);
 str1=str1+ch;
}
System.out.println("The Reversed String is:"+str1);

		}

}
