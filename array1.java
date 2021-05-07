import java.util.*;
class array1{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int[] b=new int[5];
int c[]=new int[5];
for(int i=0;i<5;i++)
{
System.out.println("enter the input" +a[i]);
a[i]=sc.nextInt();
}
System.out.println(".........");
for(int i=0;i<5;i++)
{
System.out.println("enter the input"+b[i]);
b[i]=sc.nextInt();
}
System.out.println("................");
for( int i=0;i<5;i++)
{
	
c[i]=a[i]+b[i];
}
for(int x:c)
{
System.out.print(x+" ");
}
}
}