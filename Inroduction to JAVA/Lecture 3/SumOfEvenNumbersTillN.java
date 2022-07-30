/* Given a number N, print sum of all even numbers from 1 to N. */

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int x=1;
        while(x<=n){
            
            if(x%2==0){
                sum += x;
            }
            x++;
        }
		
        System.out.println(sum);
	}

}
