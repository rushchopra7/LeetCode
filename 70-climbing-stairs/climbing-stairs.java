class Solution {
     private Map<Integer, Integer> mem = new HashMap<>();
    public int climbStairs(int n) {
       
        //Recusrion
        if(n==1){
            return 1;
            }       
        if(n==2) {
            return 2;
            }
        

        /* Apparently recursion is not working here
        else 
        return climbStairs(n-1) + climbStairs(n-2) ; */

        //Iterative approach

         /*
         int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second; */

     if (mem.containsKey(n)){
        return mem.get(n);
     }
      int totalSteps = climbStairs(n-1) + climbStairs(n-2);
      mem.put(n,totalSteps);
      return totalSteps ;

    }
        
    }

