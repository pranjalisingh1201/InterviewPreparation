In simple words , it is an optimization over plain recursion.
The idea is to reuse the solutions of subproblems when there are overlapping sub problem.
1) Memoization (Top down)
2) Tabulation (bottom up)

Applications
    1) Bellman Ford Algorithm
    2) Floyd Warshall Algorithm
    3) Diff Utility(LCS)
    4) Search Closed Words(Edit Distance)
    5) Resource Allocation (0-1 Knapsack)

Dynamic Programming (Memoization):

Fibonacci Numbers : F0=0, F1=1, F2=1, F3=2, .....

Input : n =3 
Output : 2

Input : n=0
Output : 0

int fib(int n)
{
    if(n==0 || n==1)return n;
    else return fib(n-1)+fib(n-2);
}


In Dynamic Programming we somehow come up with a solution where we do not compute the same overlapping sub problems twice.

Normal Recursion - 2^n
Dynamic Programming - o(n)

Memo arrays [n+1], intialize as -1
if(memo[n]==-1) then compute the sub-problem.
Store the sub-problem result.
Reuse the sub-problem result for further computations.

int memo[n+1]={-1,-1,-1,-1,-1}

int fib(n){
    if(memo[n]==1)
    {
        int res;
        if(n==0||n==1) res=n;
        else 
        res=fib(n-1)+fib(n+1);
        memo[n]=res;

    }
    return memo[n];
}

Recursion tree for memoization :

            fib(5)
              /\
        fib(4) fib(3)
          /\
    fib(3) fib(2)
        /\
   fib(2)fib(1)
    /\
fib(1) fib(0)

0   1  2  3  4  5
-1 -1 -1 -1 -1 -1

0   1  2  3  4  5
-1  1 -1 -1 -1 -1

0  1  2  3  4  5
0  1 -1 -1 -1 -1

0  1  2  3  4  5
0  1  1 -1 -1 -1

0  1  2  3  4  5
0  1  1  2 -1 -1


0  1  2  3  4  5
0  1  1  2  3 -1

0  1  2  3  4  5
0  1  1  2  3  5

Time Complexity : 0(n)

Memo array dimensions are decided by no of parameters in the recursive call.

Tabulation : Bottom UP

We solve a problem here in bottom up manner meaning :

first solve sub-problems before calling for n.

to get the values for f[5] we need to already have values for f[4], f[3]

int fib(int n)
{
    int f[n+1];
    f[0]=0,f[1]=1;
    for(int i=2;i<=n;i++)
        f[i]=f[i-1]+f[i-2]
    return f[n];   
}


Longest Common Subsequence :

- Subsequences are picking 0 or more characters which may not be contiguous and thier order has to be same as input string.
- In a string there are 2^n no to subsequences possible.

- Input : s1 = "ABCDGH"
          s2 = "AEDFHR"

          common = A,D,H
- Output : 3
- Input : s1 = "AGGTAB"
          s2 = "GXTXAYB"

          common = G,T,A,B
- Output : 4
- Input : s1 = "XYZ"
          s2 = "XYZ"

          common = X,Y,Z
- Output : 3
- Input : s1 = "XYZ"
          s2 = "ABC"

          common = 0
- Output : 0