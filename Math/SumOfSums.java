/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		     while(T-->0){
		         int D = sc.nextInt();
		         int N = sc.nextInt();
		           for(int i=0; i<D;i++){
		               N=(N*(N+1))/2;
		           }
		           System.out.println(N);
		    }
		
	}
}