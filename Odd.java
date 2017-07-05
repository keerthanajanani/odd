# odd
import java.util.*;
import java.io.*;
public class Odd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enetr the n value");
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
if(i%2!=0)
{
//System.out.println("odd number is");
System.out.println(i);
}
}
}
}
