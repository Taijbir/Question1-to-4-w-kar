import java.util.*;  

public class Q1 {
 
    public static void main(String[] args) {
      
    int counter = 1;
    int x = 1;

    System.out.println("Enter an integer to calculate its factorial");
    Scanner reader = new Scanner(System.in);
    int num = reader.nextInt();
    
    for (counter = 1; counter <= num; counter++){
      x = x*counter;
    }    
    System.out.println(x);
    
    }
}    