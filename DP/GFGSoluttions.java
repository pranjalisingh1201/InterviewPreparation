//Count ways to reach the n'th stair
/*
 * Tabulation Solution:
 * 1) Declare a dp[] array of size[n+1]
 * 2) Intialize base condition as i=0 and i=1 of dp the dp array as 1.
 * 3) Set an iterative loop that traverses the array(from index 2 to n) and for every index set its value as dp[n-1] and dp[n-2] 
 * 
 * //{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
       int memo[] = new int[n+1];
       return count(n,memo);
    }
    
    int count(int n , int memo[])
    {   
        // if(memo[n]!=-1) return memo[n];
        // if(n==0)return 1;
        // //else if(n<0)return 0;
        // int count1=0,count2=0;
        // if(n-1>=0) 
        //     count1 += countWays(n-1)%1000000007;
        // if(n-2>=0)
        //     count2 += countWays(n-2)%1000000007;
        // memo[n]=(count1+count2)%1000000007;
        // return memo[n];
        
        memo[0] = 1;
        memo[1] = 1;
        
        for(int i=2;i<=n;i++)
        {
            memo[i]=((memo[i-1]%1000000007)+(memo[i-2]%1000000007))%1000000007;
        }
        return memo[n];
    }
    
    
}


 
Max Sum without Adjacents
---------------------------

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            Solution obj=new Solution();
            int res=obj.minimizeCost(arr,N,K);
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimizeCost(int arr[],int n,int k){
        //code here
        int dp []=new int [n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i =1;i<n;i++)
        {
            int mincost =Integer.MAX_VALUE;
            for(int j=1;j<=k;j++)
            {int step1 =Integer.MAX_VALUE;
            if(i>=j)step1 = dp[i-j]+Math.abs(arr[i]-arr[i-j]);
            mincost = Math.min(mincost,step1);
            dp[i] = mincost;
            }
        }
        return dp[n-1];
    }
}


Minimal Cost
-------------------------

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            Solution obj=new Solution();
            int res=obj.minimizeCost(arr,N,K);
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimizeCost(int arr[],int n,int k){
        //code here
        int dp []=new int [n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i =1;i<n;i++)
        {
            int mincost =Integer.MAX_VALUE;
            for(int j=1;j<=k;j++)
            {int step1 =Integer.MAX_VALUE;
            if(i>=j)step1 = dp[i-j]+Math.abs(arr[i]-arr[i-j]);
            mincost = Math.min(mincost,step1);
            dp[i] = mincost;
            }
        }
        return dp[n-1];
    }
}


Geek Jump
------------------
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimumEnergy(int arr[],int n){
        //code here
        // if(n==1) return 0;
        // int leftmin = Integer.MAX_VALUE , rightmin = Integer.MAX_VALUE;
        // if(n-1>0)
        //     leftmin = minimumEnergy(arr,n-1)+Math.abs(arr[n-2]-arr[n-1]);
        // if(n-2>0)
        //     rightmin =  minimumEnergy(arr,n-2)+Math.abs(arr[n-3]-arr[n-1]);
        // int min = Math.min(leftmin,rightmin);
        // return min;
        
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        return mini(arr,n,dp);
        
    }
    
    int mini(int arr[],int n , int dp[])
    {
        // if(dp[n]!=-1)return dp[n];
        // if(n==1) return 0;
        // int leftmin = Integer.MAX_VALUE , rightmin = Integer.MAX_VALUE;
        // if(n-1>0)
        //     leftmin = minimumEnergy(arr,n-1)+Math.abs(arr[n-2]-arr[n-1]);
        // if(n-2>0)
        //     rightmin =  minimumEnergy(arr,n-2)+Math.abs(arr[n-3]-arr[n-1]);
        // dp[n]= Math.min(leftmin,rightmin);
        // return dp[n];
        
        dp[0]=0;
        int left = Integer.MAX_VALUE,right=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
               left = dp[i-1]+Math.abs(arr[i-1]-arr[i]);
               if(i>1){
               right = dp[i-2]+Math.abs(arr[i-2]-arr[i]);}
               dp[i]=Math.min(left,right);
        }
        return dp[n-1];
    }
}

Stickler Thief
---------------



class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int dp [] = new int [n+1];
        Arrays.fill(dp,-1);
        dp[0]=arr[0];
        for(int i =1;i<n;i++)
        {
            int notpick = dp[i-1];
            int pick = arr[i];
            if(i>1)
            pick = dp[i-2]+arr[i];
            dp[i]=Math.max(pick,notpick);
            
        }
        return dp[n-1];
    }
}
*/