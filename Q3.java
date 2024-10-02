 public class Q3 {

   public static void main(String[] args) {
     System.out.println(getMiddleCharacter("Hello"));
   }

   public static String getMiddleCharacter(String str) {
     int length = str.length();
     if (length % 2 == 0) {
       int mid = length / 2 - 1;
       return str.substring(mid, mid + 2);
     }
     else {
       int mid = length / 2;
       return Character.toString(str.charAt(mid));
     }
   }

 }