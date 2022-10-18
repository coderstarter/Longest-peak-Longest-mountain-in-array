 public static int longestPeak(int[] array) {
    // Write your code here.
    int n=array.length;
    int ans = 0;
    // find first peak point and that can't be at 0 index 
    // as it should have its left neighbour to compare it
    // 1 to n-2 as last elt also can't be peak no elt is there to comapre
    for(int i=1;i<=n-2;)
      {
        if(array[i]>array[i-1] && array[i]>array[i+1]) // as it should have to greater than both of its neightbour
        {
          int j=i;
          int ct=1;
          while(j>0 && array[j]>array[j-1])
            {
              j--;
              ct++;
            }
          while(i<n-1 && array[i]>array[i+1]) // array[i+1] should be valid index if
            // i<n-1 as if i==n-1  then n-1 + i+1 == n+i we are getting n and n is not valid one
          {
            i++;
            ct++;
          }
          ans = Math.max(ans,ct);
        }
        else
        {
          i++;
        }
      }
    return ans;
  }
