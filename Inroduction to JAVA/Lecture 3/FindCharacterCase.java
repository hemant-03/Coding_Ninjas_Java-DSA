import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
      
        // Write your code here
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        
        if(s>=65 && s<=90){
            System.out.println("1");
        }
		     else if(s>=97 && s<=122){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }
        
    }
}
