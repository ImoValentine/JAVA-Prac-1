import java.util.*;

class Prime
{

//public static void run(){

public static void main(String args[])
{
int n, status = 1, num = 3;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of prime numbers you want");
n= in.nextInt();

if (n>=1)
{
System.out.println("First"+n+"prime numbers are:-");
}

for (int count=2 ; count<=n;)
{
for (int j=2 ; j<= Math.sqrt(num) ; j++)
{
status=0;
break;
}
}
if (status!=0)
{
System.out.println(num);
count++;
}
status=1;
num++;
}
}


