import java.io.*;
import java.util.Scanner;
public class LeapyearOrNot
{
public static void main(String args[])
{ 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter the year:");
int i= sc.nextInt();
  if(i % 400 == 0 || i % 4 == 0 )
  {
  System.out.println("Leap Year");
  }
  else
  {
  System.out.println(" not a Leap Year");
  }
}
}