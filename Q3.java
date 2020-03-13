import java.util.*;  

public class Q3 {
 public static void main(String[] args) {
   Scanner reader = new Scanner(System.in);
   
   int number;
   int max = Integer.MIN_VALUE;  
   int min = Integer.MAX_VALUE;  
   String answer;
   
   do {
     System.out.print("Enter the number ");
     num = reader.nextInt();
     if(num > max){
       max = num;
     }
     if(number < min){
       min = num;
     }
     System.out.print("Do you want to continue Yes or no? ");
     answer = reader.next();
 
     } while(answer.equals("yes") || answer.equals("Yes"));
 
     System.out.println("Largest number: " + max);
     System.out.println("Smallest number: " + min);
    }  
}
   