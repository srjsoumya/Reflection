class ForEach{
public static void main(String []args)
{
int num[]=new int[10];
int i,j=50,k;
for(i=0;i<10;i++)
{
num[i]=j;
j++;
}
for(i=0;i<10;i++)
System.out.println("num["+i+"] is "+num[i]);
System.out.println();
for(i=9;i>=0;i--)
System.out.println("num["+i+"] is "+num[i]);
}
}