import java.util.Scanner;
 
class palindrome
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner obj = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = obj.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println("The string you entered is " + str + " & it is a palindrome");
      else
         System.out.println("The string you entered is " + str + " & it is not a palindrome");
 
   }
}