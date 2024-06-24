import java.util.Scanner;
public class ReverseNumber
{
public static void main (String args[])
{
int m,n,sum=0;
Scanner s=new Scanner(System.in);
System .out.print("enter the numbers:");
m=s.nextlnt();
while(m>0);
{
n=m%10;
sum=sum*10+n;
m=m/10;
}
Sytem.out.println("reverse of a number is"+sum);
}
}
