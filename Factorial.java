public class Factorial {
   public static void main(String[] args) {
      // int no = 5;
      java.util.Scanner s = new java.util.Scanner(System.in);
      System.out.println("Enter Number");
      int no = s.nextInt();
      int fact = 1;
      for (int i = 1; i <= no; i++) {
         fact = fact * i;
      }
      System.out.println("Factorial" + " of " + no + " is " + fact);
      // second method of decriment in factorial function
      // for(int i=no; i>=1; i--){
      //    fact= fact*i;

      // }
      // System.out.println("Factorial" + " of " + no + " is " + fact);
   }
}
